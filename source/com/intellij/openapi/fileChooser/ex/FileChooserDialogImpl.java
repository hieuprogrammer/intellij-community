package com.intellij.openapi.fileChooser.ex;

import com.intellij.ide.actions.SynchronizeAction;
import com.intellij.ide.util.treeView.NodeRenderer;
import com.intellij.openapi.Disposable;
import com.intellij.openapi.actionSystem.*;
import com.intellij.openapi.fileChooser.FileChooserDescriptor;
import com.intellij.openapi.fileChooser.FileChooserDialog;
import com.intellij.openapi.fileChooser.FileElement;
import com.intellij.openapi.fileChooser.FileSystemTree;
import com.intellij.openapi.fileChooser.actions.*;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.DialogWrapper;
import com.intellij.openapi.ui.Messages;
import com.intellij.openapi.ui.TitlePanel;
import com.intellij.openapi.util.IconLoader;
import com.intellij.openapi.vfs.LocalFileSystem;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.ui.LabeledIcon;
import com.intellij.ui.UIBundle;
import com.intellij.util.containers.HashMap;
import com.intellij.util.containers.HashSet;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import javax.swing.event.TreeExpansionEvent;
import javax.swing.event.TreeExpansionListener;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FileChooserDialogImpl extends DialogWrapper implements FileChooserDialog{
  private final FileChooserDescriptor myChooserDescriptor;
  protected FileSystemTreeImpl myFileSystemTree;

  private static VirtualFile ourLastFile;
  private Project myProject;
  private VirtualFile[] myChosenFiles = VirtualFile.EMPTY_ARRAY;

  private final List<Disposable> myDisposables = new ArrayList<Disposable>();

  public FileChooserDialogImpl(FileChooserDescriptor chooserDescriptor, Project project) {
    super(project, true);
    myProject = project;
    myChooserDescriptor = chooserDescriptor;
    setTitle(UIBundle.message("file.chooser.default.title"));
  }

  public FileChooserDialogImpl(FileChooserDescriptor chooserDescriptor, Component parent) {
    super(parent, true);
    myChooserDescriptor = chooserDescriptor;
    setTitle(UIBundle.message("file.chooser.default.title"));
  }

  @NotNull
  public VirtualFile[] choose(VirtualFile toSelect, Project project) {
    init();

    VirtualFile selectFile = null;

    if (toSelect == null && ourLastFile == null) {
      if (project != null && project.getBaseDir() != null) {
        selectFile = project.getBaseDir();
      }
    } else {
      selectFile = (toSelect == null) ? ourLastFile : toSelect;
    }

    final VirtualFile file = selectFile;

    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        if (file == null || !file.isValid()) {
          return;
        }
        if (select(file)) {
          return;
        }
        VirtualFile parent = file.getParent();
        if (parent != null) {
          select(parent);
        }
      }
    });
    show();

    return myChosenFiles;
  }

  protected DefaultActionGroup createActionGroup() {
    final DefaultActionGroup group = new DefaultActionGroup();

    addToGroup(group, new GotoHomeAction(myFileSystemTree));
    addToGroup(group, new GotoProjectDirectory(myFileSystemTree));
    addToGroup(group, new GotoModuleDirectory(myFileSystemTree, myChooserDescriptor.getContextModule()));

    group.addSeparator();
    addToGroup(group, new NewFolderAction(myFileSystemTree));
    addToGroup(group, new FileDeleteAction(myFileSystemTree));
    group.addSeparator();

    final SynchronizeAction syncAction = new SynchronizeAction();
    AnAction original = ActionManager.getInstance().getAction(IdeActions.ACTION_SYNCHRONIZE);
    syncAction.copyFrom(original);
    final JTree tree = myFileSystemTree.getTree();
    syncAction.registerCustomShortcutSet(original.getShortcutSet(), tree);
    group.add(syncAction);
    myDisposables.add(new Disposable() {
      public void dispose() {
        syncAction.unregisterCustomShortcutSet(tree);
      }
    });

    group.addSeparator();
    addToGroup(group, new MyShowHiddensAction());

    return group;
  }

  private void addToGroup(DefaultActionGroup group, AnAction action) {
    group.add(action);
    if (action instanceof Disposable) {
      myDisposables.add(((Disposable)action));
    }
  }

  protected final JComponent createTitlePane() {
    return new TitlePanel(myChooserDescriptor.getTitle(), myChooserDescriptor.getDescription());
  }

  protected JComponent createCenterPanel() {
    JPanel panel = new MyPanel();

    panel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

    createTree();

    final DefaultActionGroup group = createActionGroup();
    ActionToolbar toolBar = ActionManager.getInstance().createActionToolbar(ActionPlaces.UNKNOWN, group, true);
    panel.add(toolBar.getComponent(), BorderLayout.NORTH);

    registerMouseListener(group);

    JScrollPane scrollPane = new JScrollPane(myFileSystemTree.getTree());
    scrollPane.setBorder(BorderFactory.createLineBorder(new Color(148, 154, 156)));
    panel.add(scrollPane, BorderLayout.CENTER);
    panel.setPreferredSize(new Dimension(400, 400));

    return panel;
  }

  public JComponent getPreferredFocusedComponent() {
    return myFileSystemTree.getTree();
  }

  public final void dispose() {
    for (Disposable disposable : myDisposables) {
      disposable.dispose();
    }
    myDisposables.clear();
    myFileSystemTree.dispose();
    LocalFileSystem.getInstance().removeWatchedRoots(myRequests.values());
    super.dispose();
  }

  protected void doOKAction() {
    if (!isOKActionEnabled()) {
      return;
    }

    final VirtualFile[] selectedFiles = getSelectedFiles();
    try {
      myChooserDescriptor.validateSelectedFiles(selectedFiles);
    }
    catch (Exception e) {
      Messages.showErrorDialog(getContentPane(), e.getMessage(), UIBundle.message("file.chooser.default.title"));
      return;
    }

    myChosenFiles = selectedFiles;
    if (selectedFiles.length == 0) {
      close(CANCEL_EXIT_CODE);
      return;
    }
    ourLastFile = selectedFiles[selectedFiles.length - 1];

    super.doOKAction();
  }

  public final void doCancelAction() {
    myChosenFiles = VirtualFile.EMPTY_ARRAY;
    super.doCancelAction();
  }

  public final boolean select(final VirtualFile file) {
    return myFileSystemTree.select(file);
  }

  protected JTree createTree() {
    myFileSystemTree = new FileSystemTreeImpl(myProject, myChooserDescriptor);
    myFileSystemTree.addOkAction(new Runnable() {
      public void run() {doOKAction(); }
    });
    JTree tree = myFileSystemTree.getTree();
    tree.setCellRenderer(new NodeRenderer());
    tree.addTreeSelectionListener(new FileTreeSelectionListener());
    tree.addTreeExpansionListener(new FileTreeExpansionListener());
    setOKActionEnabled(false);
    return tree;
  }

  protected final void registerMouseListener(final ActionGroup group) {
    myFileSystemTree.registerMouseListener(group);
  }

  protected VirtualFile[] getSelectedFiles() {
    return myFileSystemTree.getChoosenFiles();
  }

  private final Map<String, LocalFileSystem.WatchRequest> myRequests = new HashMap<String, LocalFileSystem.WatchRequest>();

  private final class FileTreeExpansionListener implements TreeExpansionListener {
    public void treeExpanded(TreeExpansionEvent event) {
      final Object[] path = event.getPath().getPath();
      Set<String> toAdd = new HashSet<String>();

      for (Object o : path) {
        final DefaultMutableTreeNode node = ((DefaultMutableTreeNode)o);
        Object userObject = node.getUserObject();
        if (userObject instanceof FileNodeDescriptor) {
          final VirtualFile file = ((FileNodeDescriptor)userObject).getElement().getFile();
          if (file != null) {
            final String rootPath = file.getPath();
            if (myRequests.get(rootPath) == null) {
              toAdd.add(rootPath);
            }
          }
        }
      }

      if (toAdd.size() > 0) {
        final Set<LocalFileSystem.WatchRequest> requests = LocalFileSystem.getInstance().addRootsToWatch(toAdd, false);
        for (LocalFileSystem.WatchRequest request : requests) {
          myRequests.put(request.getRootPath(), request);
        }
      }
    }

    public void treeCollapsed(TreeExpansionEvent event) {
      //Do not unwatch here!!!
    }
  }

  private final class FileTreeSelectionListener implements TreeSelectionListener {
    public void valueChanged(TreeSelectionEvent e) {
      TreePath[] paths = e.getPaths();

      boolean enabled = true;
      for (TreePath treePath : paths) {
        if (!e.isAddedPath(treePath)) {
          continue;
        }
        DefaultMutableTreeNode node = (DefaultMutableTreeNode)treePath.getLastPathComponent();
        Object userObject = node.getUserObject();
        if (!(userObject instanceof FileNodeDescriptor)) {
          enabled = false;
          break;
        }
        FileElement descriptor = ((FileNodeDescriptor)userObject).getElement();
        VirtualFile file = descriptor.getFile();
        enabled = myChooserDescriptor.isFileSelectable(file);
      }
      setOKActionEnabled(enabled);
    }
  }

  public static abstract class FileChooserAction extends AnAction implements Disposable {
    private final FileSystemTree myFileSystemTree;
    private Disposable myDisposable;

    public FileChooserAction(String text, String description, Icon icon, FileSystemTree fileSystemTree, KeyStroke shortcut) {
      super(text, description, (shortcut == null) ? icon : new LabeledIcon(icon, null, KeyEvent.getKeyText(shortcut.getKeyCode()) + ". "));
      myFileSystemTree = fileSystemTree;
      if (shortcut != null) {
        final JTree tree = fileSystemTree.getTree();
        registerCustomShortcutSet(new CustomShortcutSet(shortcut), tree);
        myDisposable = new Disposable() {
          public void dispose() {
            unregisterCustomShortcutSet(tree);
          }
        };
      }
    }

    public void dispose() {
      if (myDisposable != null) {
        myDisposable.dispose();
        myDisposable = null;
      }
    }

    final public void actionPerformed(AnActionEvent e) {
      actionPerformed(myFileSystemTree, e);
    }

    final public void update(AnActionEvent e) {
      update(myFileSystemTree, e);
    }

    protected abstract void update(FileSystemTree fileChooser, AnActionEvent e);

    protected abstract void actionPerformed(FileSystemTree fileChooser, AnActionEvent e);
  }

  /**
   * @author Vladimir Kondratyev
   */
  private final class MyShowHiddensAction extends ToggleAction{
    public MyShowHiddensAction() {
      super(UIBundle.message("file.chooser.show.hidden.action.name"), UIBundle.message("file.chooser.show.hidden.action.description"), IconLoader.getIcon("/actions/showHiddens.png"));
    }

    public boolean isSelected(AnActionEvent e) {
      return myFileSystemTree.areHiddensShown();
    }

    public void setSelected(AnActionEvent e, boolean state) {
      myFileSystemTree.showHiddens(state);
    }
  }

  private final class MyPanel extends JPanel implements DataProvider {
    public MyPanel() {
      super(new BorderLayout());
    }

    public Object getData(String dataId) {
      if (DataConstants.VIRTUAL_FILE_ARRAY.equals(dataId)) {
        return getSelectedFiles();
      }
      return null;
    }
  }

}
