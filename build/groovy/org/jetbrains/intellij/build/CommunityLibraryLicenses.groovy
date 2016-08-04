/*
 * Copyright 2000-2016 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jetbrains.intellij.build

import groovy.transform.CompileStatic

import static org.jetbrains.intellij.build.LibraryLicense.jetbrainsLibrary
import static org.jetbrains.intellij.build.LibraryLicense.libraryLicense

/**
 * @author nik
 */
@CompileStatic
class CommunityLibraryLicenses {
  public static final List<LibraryLicense> LICENSES_LIST = [
    libraryLicense(name: "aether-api-0.9.0.M2.jar", version: "0.9.0.M2", libraryNames: ["aether-api-0.9.0.M2.jar"],
                   license: "Eclipse Public License v1.0", url: "http://www.eclipse.org/aether/",
                   licenseUrl: "http://www.eclipse.org/org/documents/epl-v10.html"),
    libraryLicense(name: "aether-api", version: "1.13.1", libraryNames: ["aether-api-1.13.1.jar"], license: "Apache 2.0",
                   url: "http://maven.apache.org/", licenseUrl: "http://www.apache.org/licenses/LICENSE-2.0"),
    libraryLicense(name: "Alloy L&F", libraryName: "alloy.jar", version: "1.4.4", license: "link (company license)",
                   url: "http://lookandfeel.incors.com/",
                   licenseUrl: "http://lookandfeel.incors.com/display_licence.php?back=purchase.php&selMenu=Purchase"),
    libraryLicense(name: "Android Builder Model", libraryName: "builder-model", license: "Apache 2.0", url: "http://source.android.com/"),
    libraryLicense(name: "Android Builder", libraryName: "android-builder", license: "Apache 2.0", url: "http://source.android.com/"),
    libraryLicense(name: "Android Gradle model", libraryName: "android-gradle-model", version: "0.4-SNAPSHOT", license: "Apache 2.0",
                   url: "https://android.googlesource.com/platform/tools/build/+/master/gradle-model/"),
    libraryLicense(name: "Android SDK Tools JPS", libraryName: "android-sdk-tools-jps", license: "Apache 2.0",
                   url: "http://source.android.com/"),
    libraryLicense(name: "Android SDK Tools", libraryName: "android-sdk-tools", license: "Apache 2.0", url: "http://source.android.com/"),
    libraryLicense(name: "Ant", version: "1.9", license: "Apache 2.0", url: "http://ant.apache.org/",
                   licenseUrl: "http://ant.apache.org/license.html"),
    libraryLicense(name: "ANTLR 4 Runtime", libraryName: "antlr-runtime-4.1.jar", version: "4.1", license: "BSD",
                   url: "http://www.antlr.org", licenseUrl: "http://www.antlr.org/license.html"),
    libraryLicense(name: "Antlr", libraryName: "antlr.jar", version: "3.4", license: "BSD", url: "http://www.antlr.org",
                   licenseUrl: "http://www.antlr.org/license.html"),
    libraryLicense(name: "Apache Commons BeanUtils", libraryName: "commons-beanutils.jar", version: "1.6", license: "Apache 2.0",
                   url: "http://commons.apache.org/beanutils/"),
    libraryLicense(name: "Apache Commons Codec", libraryName: "commons-codec", version: "1.8", license: "Apache 2.0",
                   url: "http://commons.apache.org/codec/", licenseUrl: "http://www.apache.org/licenses/"),
    libraryLicense(name: "Apache Commons Compress", libraryName: "commons-compress", version: "1.10", license: "Apache 2.0",
                   url: "http://commons.apache.org/proper/commons-compress/", licenseUrl: "http://www.apache.org/licenses/LICENSE-2.0"),
    libraryLicense(name: "Apache Commons Discovery", libraryName: "commons-discovery-0.4.jar", version: "0.4", license: "Apache 2.0",
                   url: "http://jakarta.apache.org/commons/discovery/", licenseUrl: "http://www.apache.org/licenses/"),
    libraryLicense(name: "Apache Commons HTTPClient", libraryName: "http-client-3.1", version: "3.1&nbsp; (with patch by JetBrains)",
                   license: "Apache 2.0", url: "http://hc.apache.org/httpclient-3.x"),
    libraryLicense(name: "Apache Commons IO", libraryName: "commons-io-1.4.jar", version: "1.4", license: "Apache 2.0",
                   url: "http://commons.apache.org/io/", licenseUrl: "http://www.apache.org/licenses/LICENSE-2.0.txt"),
    libraryLicense(name: "Apache Commons Logging", libraryName: "commons-logging", version: "1.1.1", license: "Apache 2.0",
                   url: "http://commons.apache.org/logging/"),
    libraryLicense(name: "Apache Commons Net", libraryName: "commons-net", version: "3.3", license: "Apache 2.0",
                   url: "http://commons.apache.org/net/"),
    libraryLicense(name: "Apache Lucene", libraryName: "lucene-core-2.4.1.jar", version: "2.4.1", license: "Apache 2.0",
                   url: "http://lucene.apache.org/java"),
    libraryLicense(name: "Apache Sanselan", libraryName: "Sanselan", version: "0.98", license: "Apache 2.0",
                   url: "https://commons.apache.org/proper/commons-imaging/"),
    libraryLicense(name: "Apache XML Graphics Commons", libraryName: "xmlgraphics-commons-1.3.1.jar", version: "1.3.1",
                   license: "Apache 2.0", url: "http://xmlgraphics.apache.org/commons/",
                   licenseUrl: "http://www.apache.org/licenses/LICENSE-2.0"),
    libraryLicense(name: "ASM Bytecode Manipulation Framework", libraryName: "ASM", version: "6.0-ALPHA (with patches by JetBrains)",
                   license: "BSD", url: "http://asm.objectweb.org/", licenseUrl: "http://asm.objectweb.org/license.html"),
    libraryLicense(name: "assertJ", version: "3", license: "Apache 2.0", url: "https://github.com/joel-costigliola/assertj-core"),
    libraryLicense(name: "Automaton", libraryName: "automaton.jar", version: "1.11", license: "BSD", url: "http://www.brics.dk/automaton/",
                   licenseUrl: "http://www.opensource.org/licenses/bsd-license.php"),
    libraryLicense(name: "Axis", libraryName: "axis-1.4", version: "1.4", license: "Apache 2.0", url: "http://ws.apache.org/axis/",
                   licenseUrl: "http://www.apache.org/licenses/LICENSE-2.0.html"),
    libraryLicense(name: "bouncy-castle", version: "1.48", license: "MIT License", url: "http://bouncycastle.org",
                   licenseUrl: "http://bouncycastle.org/licence.html"),
    libraryLicense(name: "CGLib", libraryName: "CGLIB", version: "2.2.2", license: "Apache", url: "http://cglib.sourceforge.net/",
                   licenseUrl: "http://www.apache.org/foundation/licence-FAQ.html"),
    libraryLicense(name: "classworlds", libraryName: "classworlds-1.1.jar", version: "1.1", license: "codehaus",
                   url: "https://github.com/codehaus/classworlds",
                   licenseUrl: "https://github.com/codehaus/classworlds/blob/master/classworlds/LICENSE.txt"),
    libraryLicense(name: "coverage.py", attachedTo: "python-helpers", version: "3.7.1", license: "Apache 2.0",
                   url: "http://coverage.readthedocs.org/"),
    libraryLicense(name: "Cucumber-Core", libraryName: "cucumber-core", version: "1.2.4", license: "MIT License",
                   url: "https://github.com/cucumber/cucumber-jvm/", licenseUrl: "http://www.opensource.org/licenses/mit-license.html"),
    libraryLicense(name: "Cucumber-Groovy", libraryName: "cucumber-groovy", version: "1.2.4", license: "MIT License",
                   url: "https://github.com/cucumber/cucumber-jvm/", licenseUrl: "http://www.opensource.org/licenses/mit-license.html"),
    libraryLicense(name: "Cucumber-Java", libraryName: "cucumber-java", version: "1.2.4", license: "MIT License",
                   url: "https://github.com/cucumber/cucumber-jvm/", licenseUrl: "http://www.opensource.org/licenses/mit-license.html"),
    libraryLicense(name: "data-binding", libraryName: "data-binding.jar", license: "Apache 2.0", url: "http://source.android.com/"),
    libraryLicense(name: "Diffutils", libraryName: "Diffutils", version: "1.2.1", license: "The Apache Software License, Version 2.0",
                   url: "https://code.google.com/archive/p/java-diff-utils/", licenseUrl: "http://www.apache.org/licenses/LICENSE-2.0"),
    libraryLicense(name: "docutils", attachedTo: "python-helpers", version: "0.8", license: "BSD", url: "http://docutils.sourceforge.net/"),
    libraryLicense(name: "DTDParser", version: "1.13", license: "LGPL", url: "http://sourceforge.net/projects/dtdparser/",
                   licenseUrl: "http://www.opensource.org/licenses/lgpl-2.1"),
    libraryLicense(name: "Eclipse JDT Core", libraryName: "Eclipse", version: "4.2.1", license: "CPL 1.0",
                   url: "http://www.eclipse.org/jdt/core/index.php"),
    libraryLicense(name: "EditorConfig Java Core", libraryName: "editorconfig-core-java.jar", version: "1.0", license: "Apache 2.0",
                   url: "https://github.com/editorconfig/editorconfig-core-java/",
                   licenseUrl: "https://github.com/editorconfig/editorconfig-core-java/blob/master/LICENSE"),
    libraryLicense(name: "epydoc", attachedTo: "python-helpers", version: "3.0.1", license: "MIT", url: "http://epydoc.sourceforge.net/"),
    libraryLicense(name: "Fest", libraryName: "fest", version: "", license: "Apache 2.0",
                   licenseUrl: "http://www.apache.org/licenses/LICENSE-2.0.txt", url: "https://code.google.com/p/fest/"),
    libraryLicense(name: "FreeMarker", attachedTo: "coverage", version: "2.3.15", license: "BSD", url: "http://freemarker.sourceforge.net/"),
    libraryLicense(name: "FreeMarker", libraryName: "freemarker-2.3.20", version: "2.3.20", license: "BSD",
                   url: "http://freemarker.sourceforge.net/"),
    libraryLicense(name: "fxg-utils", libraryName: "fxg-utils", version: "4.9.1", license: "Apache 2.0", url: "http://flex.apache.org",
                   licenseUrl: "http://www.apache.org/licenses/LICENSE-2.0"),
    libraryLicense(name: "Gant", version: "1.9.8", libraryName: "gant-1.9.11_groovy-2.3.0.jar", license: "Apache 2.0",
                   url: "https://github.com/codehaus/gant", licenseUrl: "https://github.com/codehaus/gant/blob/master/LICENCE.txt"),
    libraryLicense(name: "Gherkin", libraryName: "Gherkin", version: "2.12.2", license: "MIT",
                   licenseUrl: "http://www.apache.org/licenses/LICENSE-2.0.txt", url: "https://github.com/cucumber/gherkin"),
    libraryLicense(name: "Google Feedback", libraryName: "GoogleFeedback.jar", version: "", license: "TBD"),
    libraryLicense(name: "gradle-tooling-api-2.13.jar", version: "2.13", license: "Apache 2.0", url: "http://gradle.org/",
                   licenseUrl: "http://gradle.org/license"),
    libraryLicense(name: "Gradle", version: "2.13", license: "Apache 2.0", url: "http://gradle.org/",
                   licenseUrl: "http://gradle.org/license"),
    libraryLicense(name: "GradleGuava", version: "14.0.1", license: "Apache 2.0", url: "http://code.google.com/p/guava-libraries/",
                   licenseUrl: "http://apache.org/licenses/LICENSE-2.0"),
    libraryLicense(name: "GradleJnaPosix", version: "1.0.3", license: "LGPL 2.1", url: "http://www.jruby.org/",
                   licenseUrl: "http://www.gnu.org/licenses/lgpl-2.1.txt"),
    libraryLicense(name: "Groovy", version: "2.4.6", license: "Apache 2.0", url: "http://groovy-lang.org/"),
    libraryLicense(name: "Gson", version: "2.2.4", libraryName: "gson", license: "Apache 2.0", url: "http://code.google.com/p/google-gson/"),
    libraryLicense(name: "Guava", version: "19.0", license: "Apache 2.0", url: "http://code.google.com/p/guava-libraries/",
                   licenseUrl: "http://ant.apache.org/license.html"),
    libraryLicense(name: "hamcrest", version: "1.3", license: "BSD", url: "http://hamcrest.org/",
                   licenseUrl: "http://opensource.org/licenses/BSD-3-Clause"),
    libraryLicense(name: "HttpComponents HttpClient", libraryName: "http-client", version: "4.3.2", license: "Apache 2.0",
                   url: "http://hc.apache.org/httpcomponents-client-ga/index.html"),
    libraryLicense(name: "imgscalr", libraryName: "imgscalr", version: "4.2", license: "Apache 2.0",
                   licenseUrl: "http://www.apache.org/licenses/LICENSE-2.0.txt", url: "https://github.com/thebuzzmedia/imgscalr"),
    libraryLicense(name: "batik", libraryName: "batik", version: "1.7.1", license: "Apache 2.0",
                   licenseUrl: "http://www.apache.org/licenses/LICENSE-2.0.txt", url: "https://xmlgraphics.apache.org/batik/"),
    libraryLicense(name: "xmlgraphics-commons", libraryName: "xmlgraphics-commons", version: "1.5", license: "Apache 2.0",
                   licenseUrl: "http://www.apache.org/licenses/LICENSE-2.0.txt", url: "https://xmlgraphics.apache.org/commons/"),
    libraryLicense(name: "xml-apis-ext", libraryName: "xml-apis-ext", version: "1.3", license: "Apache 2.0",
                   licenseUrl: "http://www.apache.org/licenses/LICENSE-2.0.txt",
                   url: "http://xerces.apache.org/xml-commons/components/external"),
    libraryLicense(name: "ImageIO", libraryName: "com.twelvemonkeys.imageio:imageio-tiff:3.2.1", version: "3.2.1", license: "BSD",
                   url: "https://github.com/haraldk/TwelveMonkeys", licenseUrl: "https://github.com/haraldk/TwelveMonkeys#license"),
    libraryLicense(name: "ini4j", libraryName: "ini4j-0.5.2-patched", version: "0.5.2 (with a patch by JetBrains)", license: "Apache 2.0",
                   url: "http://ini4j.sourceforge.net/", attachedTo: "git4idea"),
    libraryLicense(name: "ISO RELAX", libraryName: "isorelax.jar", license: "MIT License",
                   url: "http://sourceforge.net/projects/iso-relax/", licenseUrl: "http://www.opensource.org/licenses/mit-license.html"),
    libraryLicense(name: "Jakarta ORO", libraryName: "OroMatcher", version: "2.0.8", license: "Apache",
                   url: "http://jakarta.apache.org/oro/", licenseUrl: "http://svn.apache.org/repos/asf/jakarta/oro/trunk/LICENSE"),
    libraryLicense(name: "Java-WebSocket", libraryName: "java_websocket.jar", version: "1.4.0 Trunk", license: "MIT",
                   url: "https://github.com/TooTallNate/Java-WebSocket",
                   licenseUrl: "https://github.com/TooTallNate/Java-WebSocket/blob/master/LICENSE"),
    libraryLicense(name: "JavaCVS", attachedTo: "javacvs-src", version: "no version number available (with patches by JetBrains)",
                   license: "Sun Public License", url: "https://versioncontrol.netbeans.org/javacvs/library/",
                   licenseUrl: "https://netbeans.org/about/legal/license.html"),
    libraryLicense(name: "JavaHelp", version: "2.0_02", license: "included as license/javahelp_license.html in IntelliJ IDEA distribution",
                   url: "http://java.sun.com/products/javahelp/"),
    libraryLicense(name: "javawriter", libraryName: "javawriter", license: "Apache 2.0", url: "https://github.com/square/javawriter"),
    libraryLicense(name: "JAXB", libraryName: "JAXB", version: "2.2.4-1", license: "CDDL 1.1", url: "http://jaxb.java.net/",
                   licenseUrl: "http://glassfish.java.net/public/CDDL+GPL_1_1.html"),
    libraryLicense(name: "Jaxen", version: "", license: "modified Apache", url: "http://www.jaxen.org/",
                   licenseUrl: "http://www.jaxen.org/license.html"),
    libraryLicense(name: "jayatana", libraryName: "jayatana", version: "1.2.4", license: "MIT License",
                   url: "https://code.google.com/p/java-swing-ayatana/", licenseUrl: "http://opensource.org/licenses/mit-license.php"),
    libraryLicense(name: "JCIP Annotations", libraryName: "jcip", license: "Creative Commons Attribution License",
                   url: "http://www.jcip.net", licenseUrl: "http://creativecommons.org/licenses/by/2.5"),
    libraryLicense(name: "JDOM", version: "1.1 (with patches by JetBrains)", license: "modified Apache", url: "http://www.jdom.org/",
                   licenseUrl: "http://www.jdom.org/docs/faq.html#a0030"),
    libraryLicense(name: "JediTerm", libraryName: "jediterm-pty", version: "2.2", license: "LGPL 2",
                   url: "https://github.com/JetBrains/jediterm", licenseUrl: "https://github.com/JetBrains/jediterm/blob/master/COPYING"),
    libraryLicense(name: "JEuclid", libraryName: "jeuclid-core-3.1.9.jar", version: "3.1.9", license: "Apache 2.0",
                   url: "http://jeuclid.sourceforge.net", licenseUrl: "http://sourceforge.net/p/jeuclid/code/ci/default/tree/LICENSE.txt"),
    libraryLicense(name: "JGit", libraryName: "jackson", version: "2.5.1", license: "Apache 2.0",
                   licenseUrl: "http://www.eclipse.org/org/documents/edl-v10.php", url: "https://github.com/FasterXML/jackson"),
    libraryLicense(name: "JGit", libraryName: "jgit", version: "4.0", license: "Eclipse Distribution License 1.0",
                   licenseUrl: "http://www.eclipse.org/org/documents/edl-v10.php", url: "https://eclipse.org/jgit/"),
    libraryLicense(name: "JGoodies Common", libraryName: "jgoodies-common", version: "1.2.1", license: "BSD ",
                   url: "http://www.jgoodies.com/freeware/libraries/looks/", licenseUrl: "https://opensource.org/licenses/bsd-license.html"),
    libraryLicense(name: "JGoodies Forms", libraryName: "jgoodies-forms", version: "1.1-preview 2006-05-04 11:55:37", license: "BSD ",
                   url: "http://www.jgoodies.com/freeware/libraries/forms/", licenseUrl: "https://opensource.org/licenses/bsd-license.html"),
    libraryLicense(name: "JGoodies Looks", libraryName: "jgoodies-looks", version: "2.4.2", license: "BSD ",
                   url: "http://www.jgoodies.com/freeware/libraries/looks/", licenseUrl: "https://opensource.org/licenses/bsd-license.html"),
    libraryLicense(name: "jgraphx", libraryName: "jgraphx-3.4.0.1", version: "3.4.0.1", license: "BSD",
                   url: "https://github.com/jgraph/jgraphx"),
    libraryLicense(name: "JNA", libraryName: "jna", version: "4.1.0", license: "LGPL 2.1", url: "https://github.com/java-native-access/jna",
                   licenseUrl: "http://www.opensource.org/licenses/lgpl-2.1.php"),
    libraryLicense(name: "jsch-agent-proxy for svnkit trilead", libraryName: "jsch.agentproxy.svnkit-trilead-ssh2.jar", version: "0.0.7",
                   license: "BSD", url: "https://github.com/ymnk/jsch-agent-proxy",
                   licenseUrl: "https://github.com/ymnk/jsch-agent-proxy/blob/master/LICENSE.txt"),
    libraryLicense(name: "jsch-agent-proxy", libraryName: "jsch-agent-proxy", version: "0.0.7", license: "BSD",
                   url: "https://github.com/ymnk/jsch-agent-proxy",
                   licenseUrl: "https://github.com/ymnk/jsch-agent-proxy/blob/master/LICENSE.txt"),
    libraryLicense(name: "JSch", libraryName: "JSch", version: "0.1.53", license: "BSD", url: "http://www.jcraft.com/jsch/",
                   licenseUrl: "http://www.jcraft.com/jsch/LICENSE.txt"),
    libraryLicense(name: "json-path", libraryName: "json-path-0.8.0.jar", version: "0.8.0", license: "Apache 2.0",
                   url: "http://code.google.com/p/json-path/", licenseUrl: "http://apache.org/licenses/LICENSE-2.0"),
    libraryLicense(name: "json-smart", libraryName: "json-smart-1.1.1.jar", version: "1.1.1", license: "Apache 2.0",
                   url: "http://code.google.com/p/json-smart/", licenseUrl: "http://apache.org/licenses/LICENSE-2.0"),
    libraryLicense(name: "jsr305", libraryName: "jsr305", version: "snapshot", license: "BSD", url: "http://code.google.com/p/jsr-305/",
                   licenseUrl: "http://code.google.com/p/jsr-305/source/browse/trunk/ri/LICENSE"),
    libraryLicense(name: "Jsr305", version: "1.3.9", license: "New BSD", url: "http://code.google.com/p/jsr-305/",
                   licenseUrl: "http://opensource.org/licenses/BSD-3-Clause"),
    libraryLicense(name: "JUnit", libraryName: "JUnit3", version: "3.8.1", license: "CPL 1.0", url: "http://junit.org/"),
    libraryLicense(name: "JUnit", libraryName: "JUnit4", version: "4.11", license: "CPL 1.0", url: "http://junit.org/"),
    libraryLicense(name: "junit5_rt", libraryName: "junit5_rt", version: "5.0.0", license: "Eclipse Public License 1.0",
                   url: "http://junit.org/"),
    libraryLicense(name: "jzlib", libraryName: "jzlib", version: "1.1.1", license: "BSD", url: "http://www.jcraft.com/jzlib/",
                   licenseUrl: "http://www.jcraft.com/jzlib/LICENSE.txt"),
    libraryLicense(name: "Kryo", libraryName: "Kryo", version: "2.22", license: "New BSD License",
                   url: "https://github.com/EsotericSoftware/kryo",
                   licenseUrl: "https://github.com/EsotericSoftware/kryo/blob/master/license.txt"),
    libraryLicense(name: "kXML2", libraryName: "kxml2", version: "2.3.0", license: "BSD", url: "http://sourceforge.net/projects/kxml/"),
    libraryLicense(name: "Lobo evolution", libraryName: "Loboevolution.jar", version: "0.98.6 (with patches by JetBrains)", license: "MIT",
                   url: "http://sourceforge.net/projects/loboevolution/", licenseUrl: "http://opensource.org/licenses/mit-license.php"),
    libraryLicense(name: "Log4j", libraryName: "Log4J", version: "1.2.17", license: "Apache 2.0",
                   url: "http://logging.apache.org/log4j/1.2/index.html", licenseUrl: "http://www.apache.org/licenses/LICENSE-2.0"),
    libraryLicense(name: "Lombok AST", libraryName: "lombok-ast", version: "0.2.1", license: "MIT", url: "http://projectlombok.org/",
                   licenseUrl: "http://opensource.org/licenses/mit-license.php"),
    libraryLicense(name: "markdown4j", libraryName: "markdown4j-2.2", version: "2.2", license: "New BSD",
                   url: "https://code.google.com/p/markdown4j/", licenseUrl: "http://opensource.org/licenses/BSD-3-Clause"),
    libraryLicense(name: "markdownj", attachedTo: "tasks-core", version: "", license: "BSD", url: "https://github.com/myabc/markdownj",
                   licenseUrl: "http://www.opensource.org/licenses/bsd-license.php"),
    libraryLicense(name: "markdownj", libraryName: "markdownj", version: "0.4.2", license: "New BSD",
                   url: "https://github.com/myabc/markdownj", licenseUrl: "http://opensource.org/licenses/BSD-3-Clause"),
    libraryLicense(name: "maven-2.2.1-uber", version: "2.2.1", libraryNames: ["maven-2.2.1-uber.jar"], license: "Apache 2.0",
                   url: "http://maven.apache.org/", licenseUrl: "http://www.apache.org/licenses/LICENSE-2.0"),
    libraryLicense(name: "maven-artifact", version: "3.0.5", libraryNames: ["maven-artifact-3.0.5.jar"], license: "Apache 2.0",
                   url: "http://maven.apache.org/", licenseUrl: "http://www.apache.org/licenses/LICENSE-2.0"),
    libraryLicense(name: "maven-core", version: "3.0.5", libraryNames: ["maven-core-3.0.5.jar"], license: "Apache 2.0",
                   url: "http://maven.apache.org/", licenseUrl: "http://www.apache.org/licenses/LICENSE-2.0"),
    libraryLicense(name: "Maven", version: "2.2.1", license: "Apache 2.0", url: "http://maven.apache.org/",
                   licenseUrl: "http://www.apache.org/licenses/LICENSE-2.0"),
    libraryLicense(name: "Maven3",
                   libraryNames: ["Maven3", "maven-dependency-tree-1.2.jar", "archetype-catalog-2.2.jar", "archetype-common-2.2.jar"],
                   version: "3.0.5", license: "Apache 2.0", url: "http://maven.apache.org/",
                   licenseUrl: "http://www.apache.org/licenses/LICENSE-2.0"),
    libraryLicense(name: "mercurial_prompthooks", attachedTo: "hg4idea", version: "",
                   license: "GPLv2 (used as hg extension called from hg executable)",
                   url: "https://github.com/willemv/mercurial_prompthooks",
                   licenseUrl: "https://github.com/willemv/mercurial_prompthooks/blob/master/LICENSE.txt"),
    libraryLicense(name: "Microba", libraryName: "microba", version: "0.4.2", license: "BSD", url: "http://microba.sourceforge.net/",
                   licenseUrl: "http://microba.sourceforge.net/license.txt"),
    libraryLicense(name: "MigLayout", libraryName: "miglayout-swing", version: "3.7.1", license: "BSD", url: "http://www.miglayout.com/",
                   licenseUrl: "http://www.miglayout.com/mavensite/license.html"),
    libraryLicense(name: "minlog", libraryName: "minlog-1.2.jar", version: "1.2", license: "BSD",
                   url: "https://github.com/EsotericSoftware/minlog", licenseUrl: "http://opensource.org/licenses/BSD-3-Clause"),
    libraryLicense(name: "NanoXML", version: "2.2.3", license: "zlib/libpng",
                   url: "http://mvnrepository.com/artifact/be.cyberelf.nanoxml/nanoxml/2.2.3",
                   licenseUrl: "http://www.opensource.org/licenses/zlib-license.html"),
    libraryLicense(name: "nekohtml", libraryName: "nekohtml", version: "1.9.14", license: "Apache 2.0",
                   url: "http://nekohtml.sourceforge.net/", licenseUrl: "http://apache.org/licenses/LICENSE-2.0.txt"),
    libraryLicense(name: "Netty", libraryName: "Netty", version: "4.1.0.Beta3", license: "Apache 2.0", url: "http://netty.io",
                   licenseUrl: "http://www.apache.org/licenses/LICENSE-2.0"),
    libraryLicense(name: "Objenesis", libraryName: "objenesis-1.2.jar", version: "1.2", license: "Apache 2.0", url: "http://objenesis.org/",
                   licenseUrl: "http://apache.org/licenses/LICENSE-2.0"),
    libraryLicense(name: "opentest4j", libraryName: "opentest4j", version: "1.0.0", license: "Apache 2.0",
                   url: "https://github.com/ota4j-team/opentest4j", licenseUrl: "http://apache.org/licenses/LICENSE-2.0"),
    libraryLicense(name: "pep8.py", attachedTo: "python-helpers", version: "1.6.2", license: "MIT", url: "http://pep8.readthedocs.org/"),
    libraryLicense(name: "PicoContainer", libraryName: "picocontainer", version: "1.2", license: "BSD",
                   url: "https://github.com/codehaus/picocontainer", licenseUrl: "https://opensource.org/licenses/bsd-license.php"),
    libraryLicense(name: "plexus-archiver", libraryName: "plexus-archiver-2.4.4.jar", version: "2.4.4", license: "Apache 2.0",
                   url: "https://github.com/codehaus-plexus/plexus-archiver", licenseUrl: "http://apache.org/licenses/LICENSE-2.0"),
    libraryLicense(name: "plexus-classworlds", libraryName: "plexus-classworlds-2.4.jar", version: "2.4", license: "Apache 2.0",
                   url: "https://github.com/codehaus-plexus/plexus-classworlds", licenseUrl: "http://apache.org/licenses/LICENSE-2.0"),
    libraryLicense(name: "plexus-component-annotations", version: "1.5.5", libraryNames: ["plexus-component-annotations-1.5.5.jar"],
                   license: "Apache 2.0", url: "http://maven.apache.org/", licenseUrl: "http://www.apache.org/licenses/LICENSE-2.0"),
    libraryLicense(name: "plexus-util", version: "2.0.6", license: "Apache 2.0", url: "http://maven.apache.org/",
                   libraryNames: ['plexus-utils-2.0.6.jar'], licenseUrl: "http://apache.org/licenses/LICENSE-2.0"),
    libraryLicense(name: "Plexus Utils", libraryName: "plexus-utils-1.5.5.jar", version: "1.5.5", license: "Apache 2.0",
                   url: "http://plexus.codehaus.org/plexus-utils"),
    libraryLicense(name: "pockets", attachedTo: "python-helpers", version: "0.2.4", license: "BSD", url: "http://pockets.readthedocs.org/"),
    libraryLicense(name: "protobuf", version: "2.5.0", license: "New BSD", url: "http://code.google.com/p/protobuf/",
                   licenseUrl: "https://github.com/google/protobuf/blob/master/LICENSE"),
    libraryLicense(name: "proxy-vole", libraryName: "proxy-vole", version: "20131209", license: "New BSD License",
                   url: "http://code.google.com/p/proxy-vole/", licenseUrl: "http://opensource.org/licenses/BSD-3-Clause"),
    libraryLicense(name: "pty4j", libraryName: "pty4j", version: "0.7.1", license: "Eclipse Public License v1.0",
                   url: "https://github.com/traff/pty4j"),
    libraryLicense(name: "PureJavaComm", libraryName: "purejavacomm", version: "0.0.16", license: "BSD",
                   url: "http://www.sparetimelabs.com/purejavacomm"),
    libraryLicense(name: "ReflectASM", libraryName: "reflectasm-1.0.7.jar", version: "1.0.7", license: "BSD",
                   url: "https://github.com/EsotericSoftware/reflectasm", licenseUrl: "http://opensource.org/licenses/BSD-3-Clause"),
    libraryLicense(name: "Relax NG Object Model", libraryName: "rngom-20051226-patched.jar", license: "MIT",
                   url: "http://java.net/projects/rngom/", licenseUrl: "http://www.opensource.org/licenses/mit-license.php"),
    libraryLicense(name: "Rhino JavaScript Engine", libraryName: "rhino-js-1_7R4", version: "1.7R4", license: "MPL 1.1",
                   url: "http://www.mozilla.org/rhino/", licenseUrl: "http://www.mozilla.org/MPL/MPL-1.1.html"),
    libraryLicense(name: "RMI Stubs", attachedTo: "xslt-debugger-engine", license: "Apache 2.0",
                   url: "https://confluence.jetbrains.com/display/CONTEST/XSLT-Debugger",
                   licenseUrl: "http://www.apache.org/licenses/LICENSE-2.0"),
    libraryLicense(name: "Saxon-6.5.5", version: "6.5.5", license: "Mozilla Public License", url: "http://saxon.sourceforge.net/",
                   licenseUrl: "http://www.mozilla.org/MPL/"),
    libraryLicense(name: "Saxon-9HE", version: "9", license: "Mozilla Public License", url: "http://saxon.sourceforge.net/",
                   licenseUrl: "http://www.mozilla.org/MPL/"),
    libraryLicense(name: "SceneBuilderKit", version: "8.1.1", license: "BSD", url: "http://gluonhq.com/open-source/scene-builder/",
                   licenseUrl: "http://www.oracle.com/technetwork/licenses/bsd-license-1835287.html"),
    libraryLicense(name: "Sequence", libraryName: "sequence-library.jar", version: "bundled with SVNKit",
                   license: "BSD (see LICENSE.txt in sequence-library.jar)", url: "http://www.syntevo.com"),
    libraryLicense(name: "six.py", attachedTo: "python-helpers", version: "1.9.0", license: "MIT", url: "http://pythonhosted.org/six/"),
    libraryLicense(name: "Slf4j", version: "1.7.10", license: "MIT License", url: "http://slf4j.org/",
                   licenseUrl: "http://slf4j.org/license.html"),
    libraryLicense(name: "Snappy-Java", libraryName: "Snappy-Java", version: "0.3.1", license: "Apache 2.0",
                   url: "https://github.com/dain/snappy", licenseUrl: "http://www.apache.org/licenses/LICENSE-2.0"),
    libraryLicense(name: "SnuggleTeX", version: "1.3 (with patches by JetBrains)", license: "BSD",
                   url: "http://snuggletex.sourceforge.net/", licenseUrl: "http://snuggletex.sourceforge.net/maven/license.html"),
    libraryLicense(name: "Sonatype Nexus Indexer Artifact", libraryName: "nexus-indexer-artifact-1.0.1.jar", version: "1.0.1",
                   license: "Eclipse Public License v1.0", url: "http://nexus.sonatype.org/",
                   licenseUrl: "http://www.eclipse.org/org/documents/epl-v10.html"),
    libraryLicense(name: "Sonatype Nexus: Indexer", libraryName: "nexus-indexer-1.2.3.jar", version: "1.2.3",
                   license: "Eclipse Public License v1.0", url: "http://nexus.sonatype.org/",
                   licenseUrl: "http://www.eclipse.org/org/documents/epl-v10.html"),
    libraryLicense(name: "Sonatype Nexus: Indexer", libraryName: "nexus-indexer-3.0.4.jar", version: "3.0.4",
                   license: "Eclipse Public License v1.0", url: "http://nexus.sonatype.org/",
                   licenseUrl: "http://www.eclipse.org/org/documents/epl-v10.html"),
    libraryLicense(name: "Spantable", libraryName: "spantable.jar", version: "patched", license: "LGPL 2.1",
                   licenseUrl: "http://www.gnu.org/licenses/lgpl.html",
                   url: "https://android.googlesource.com/platform/prebuilts/tools/+/master/common/spantable/"),
    libraryLicense(name: "sphinxcontrib-napoleon", attachedTo: "python-helpers", version: "0.3.11", license: "BSD",
                   url: "http://sphinxcontrib-napoleon.readthedocs.org/"),
    libraryLicense(name: "sqljet", version: "bundled with SVNKit", libraryName: "sqljet.jar", license: "link (commercial license)",
                   url: "http://sqljet.com", licenseUrl: "http://svnkit.com/license.html"),
    libraryLicense(name: "svnkit-javahl", version: "bundled with SVNKit", libraryName: "svnkit-javahl.jar",
                   license: "link (commercial license)", url: "http://www.svnkit.com/", licenseUrl: "http://svnkit.com/license.html"),
    libraryLicense(name: "SVNKit", libraryName: "svnkit.jar", version: "1.8.12", license: "link (commercial license)",
                   url: "http://www.svnkit.com/", licenseUrl: "http://svnkit.com/license.html"),
    libraryLicense(name: "swingx", libraryName: "swingx", version: "1.6.2", license: "LGPL 2.1", url: "http://java.net/downloads/swingx/",
                   licenseUrl: "http://www.opensource.org/licenses/lgpl-2.1.php"),
    libraryLicense(name: "TestNG", version: "6.9 snapshot", license: "Apache 2.0", url: "http://testng.org/doc/",
                   licenseUrl: "https://github.com/cbeust/testng/blob/master/LICENSE.txt"),
    libraryLicense(name: "Trilead SSH", libraryName: "trilead-ssh2", version: "build 213 and 217",
                   license: "BSD style (see LICENSE.txt in trilead.jar)", url: "http://www.trilead.com/SSH_Library/"),
    libraryLicense(name: "Twitter4J", libraryName: "twitter4j-core-4.0.4.jar", version: "4.0.4", license: "Apache 2.0",
                   url: "http://twitter4j.org/", licenseUrl: "http://twitter4j.org/en/index.html#license"),
    libraryLicense(name: "Trove4j", version: "1.1 (with patches by JetBrains)", license: "LGPL", url: "http://trove4j.sourceforge.net/",
                   licenseUrl: "http://trove4j.sourceforge.net/html/license.html"),
    libraryLicense(name: "Velocity", version: "1.7", license: "Apache 2.0", url: "http://velocity.apache.org/",
                   licenseUrl: "http://www.apache.org/licenses/LICENSE-2.0.txt"),
    libraryLicense(name: "winp", version: "1.23", license: "MIT", url: "http://java.net/projects/winp",
                   licenseUrl: "http://opensource.org/licenses/mit-license.php"),
    libraryLicense(name: "Xalan", libraryName: "Xalan-2.7.1", version: "2.7.1", license: "Apache 2.0",
                   url: "http://xml.apache.org/xalan-j/", licenseUrl: "http://xml.apache.org/xalan-j/"),
    libraryLicense(name: "Xerces", version: "2.11", license: "Apache 2.0", url: "http://xerces.apache.org/xerces2-j/",
                   licenseUrl: "http://xerces.apache.org/xerces2-j/"),
    libraryLicense(name: "Xerial SQLite JDBC", libraryName: "sqlite", version: "3.6.20.1", license: "Apache 2.0",
                   url: "https://github.com/xerial/sqlite-jdbc"),
    libraryLicense(name: "XML-RPC", libraryName: "XmlRPC", version: "2.0", license: "Apache 2.0",
                   url: "http://ws.apache.org/xmlrpc/xmlrpc2/", licenseUrl: "http://ws.apache.org/xmlrpc/xmlrpc2/license.html"),
    libraryLicense(name: "XML Commons (xml-apis.jar, resolver.jar)", version: "",
                   license: "Apache 2.0, W3C Software License , public domain", url: "http://xml.apache.org/commons/",
                   licenseUrl: "http://xml.apache.org/commons/licenses.html"),
    libraryLicense(name: "XMLBeans", libraryName: "XmlBeans", version: "2.3.0", license: "Apache 2.0", url: "http://xmlbeans.apache.org/",
                   licenseUrl: "http://svn.jetbrains.org/idea/Trunk/bundled/WebServices/resources/lib/xmlbeans-2.3.0/xmlbeans.LICENSE"),
    libraryLicense(name: "XStream", libraryName: "XStream", version: "1.4.2", license: "BSD License",
                   url: "https://github.com/codehaus/xstream", licenseUrl: "https://github.com/codehaus/xstream/blob/master/LICENSE.txt"),
    libraryLicense(name: "XStream", version: "1.4.3", license: "BSD", url: "https://github.com/codehaus/xstream",
                   licenseUrl: "https://github.com/codehaus/xstream/blob/master/LICENSE.txt"),
    libraryLicense(name: "YourKit Java Profiler", libraryName: "yjp-controller-api-redist.jar", version: "8.0.x",
                   license: "link (commercial license)", url: "http://yourkit.com/",
                   licenseUrl: "http://www.yourkit.com/purchase/license.html"),

    jetbrainsLibrary("Coverage"),
    jetbrainsLibrary("CoverageReport"),
    jetbrainsLibrary("intellij-markdown.jar"),
    jetbrainsLibrary("JPS"),
    jetbrainsLibrary("Maven Embedder"),
    jetbrainsLibrary("tcServiceMessages"),
    jetbrainsLibrary("optimizedFileManager.jar"),
    jetbrainsLibrary("KotlinJavaRuntime")
  ] as List<LibraryLicense>
}