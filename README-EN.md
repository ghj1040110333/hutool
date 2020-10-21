<p align="center">
	<a href="https://tools.cn/"><img src="https://cdn.jsdelivr.net/gh/looly/tools-site/images/logo.jpg" width="45%"></a>
</p>
<p align="center">
	<strong>A set of tools that keep Java sweet.</strong>
</p>
<p align="center">
	<a href="https://tools.cn">https://tools.cn/</a>
</p>

<p align="center">
	<a target="_blank" href="https://search.maven.org/artifact/com.tools/tools-all">
		<img src="https://img.shields.io/maven-central/v/com.tools/tools-all.svg?label=Maven%20Central" />
	</a>
	<a target="_blank" href="https://license.coscl.org.cn/MulanPSL2/">
		<img src="https://img.shields.io/:license-MulanPSL2-blue.svg" />
	</a>
	<a target="_blank" href="https://www.oracle.com/technetwork/java/javase/downloads/index.html">
		<img src="https://img.shields.io/badge/JDK-8+-green.svg" />
	</a>
	<a target="_blank" href="https://travis-ci.org/looly/tools">
		<img src="https://travis-ci.org/looly/tools.svg?branch=v4-master" />
	</a>
	<a href="https://www.codacy.com/app/looly/tools?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=looly/tools&amp;utm_campaign=Badge_Grade">
		<img src="https://api.codacy.com/project/badge/Grade/3e1b8a70248c46579b7b0d01d60c6377"/>
	</a>
	<a href="https://codecov.io/gh/looly/tools">
		<img src="https://codecov.io/gh/looly/tools/branch/v4-master/graph/badge.svg" />
	</a>
	<a target="_blank" href="https://gitter.im/tools/Lobby?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge">
		<img src="https://badges.gitter.im/tools/Lobby.svg" />
	</a>
	<a target="_blank" href='https://gitee.com/loolly/tools/stargazers'>
		<img src='https://gitee.com/loolly/tools/badge/star.svg?theme=gvp' alt='star'/>
	</a>
	<a target="_blank" href='https://github.com/looly/tools'>
		<img src="https://img.shields.io/github/stars/looly/tools.svg?style=social" alt="github star"/>
	</a>
	<a target="_blank" href='https://app.netlify.com/sites/tools/deploys'>
		<img src="https://api.netlify.com/api/v1/badges/7e0824f9-5f9a-4df0-89dd-b2fccfbeccb1/deploy-status" alt="netlify"/>
	</a>
</p>

<br/>
<p align="center">
	<a href="https://qm.qq.com/cgi-bin/qm/qr?k=0wwldaU0E8r-ZzHl_wma33W7420zwXYi&jump_from=webapi"><img src="https://img.shields.io/badge/QQ%20Group-956375658-orange"/></a>
</p>
-------------------------------------------------------------------------------

## Introduction
**tools** is a small but comprehensive library of Java tools, encapsulation by static methods, reduce the cost of learning related APIs, increase productivity, and make Java as elegant as a functional programming language,let the Java be "sweet" too.

**tools** tools and methods from each user's crafted, it covers all aspects of the underlying code of Java development, it is a powerful tool for large project development to solve small problems, but also the efficiency of small projects;

**tools** is a project "util" package friendly alternative, it saves developers on the project of common classes and common tool methods of encapsulation time, so that development focus on business, at the same time can minimize the encapsulation is not perfect to avoid the bugs.

### Origin of the 'tools' name

**tools = Hu + tool**，Is the original company project after the stripping of the underlying code of the open source library , "Hu" is the short name of the company , 'tool' that tool .

tools,' Hútú '(Chinese Pinyin)，On the one hand, it is simple and easy to understand, on the other hand, it means "hard to be confused".(note: confused means 'Hútú (糊涂)' in china )

### How tools is changing the way we coding

The goal of  **tools**  is to use a simple function instead of a complex piece of code, thus avoiding the problem of "copy and paste" code as much as possible and revolutionizing the way we write code.

To calculate MD5 for example:

- 【Before】Open a search engine -> search "Java MD5 encryption" -> open a blog -> copy and paste -> change it to work.
- 【Now】import tools -> SecureUtil.md5()

tools exists to reduce code search costs and avoid bugs caused by imperfect code on the web.

### Thanks
> this README is PR by [chengxian-yi](https://gitee.com/yichengxian)
-------------------------------------------------------------------------------

## Module
A Java-based tool class for files, streams, encryption and decryption, transcoding, regular, thread, XML and other JDK methods for encapsulation，composing various Util tool classes, as well as providing the following modules：

| module          |     description                                                              |
| -------------------|---------------------------------------------------------------------------------- |
| tools-aop         | JDK dynamic proxy encapsulation to provide non-IOC faceting support |
| tools-bloomFilter | Bloom filtering to provide some Hash algorithm Bloom filtering |
| tools-cache       |     Simple cache                                                     |
| tools-core        | Core, including Bean operations, dates, various Utils, etc. |
| tools-cron        |     Task scheduling with Cron expressions     |
| tools-crypto      | Provides symmetric, asymmetric and digest algorithm encapsulation |
| tools-db          | Db operations based on ActiveRecord thinking. |
| tools-dfa         |     DFA models, such as multi-keyword lookups                |
| tools-extra       | Extension modules, third-party wrappers (template engine, mail, servlet, QR code, Emoji, FTP, word splitting, etc.) |
| tools-http        |     Http client                                 |
| tools-log         |     Log (facade)                                           |
| tools-script      |     Script execution encapsulation, e.g. Javascript      |
| tools-setting     | Stronger Setting Profile tools and Properties tools          |
| tools-system      | System parameter tools (JVM information, etc.)               |
| tools-json        |     JSON                                                                      |
| tools-captcha     |     Image Captcha                                                      |
| tools-poi         |     Tools for working with Excel and Word in POI           |
| tools-socket      |     Java-based tool classes for NIO and AIO sockets    |

Each module can be introduced individually, or all modules can be introduced by introducing `tools-all` as required.

-------------------------------------------------------------------------------

## Doc

[Chinese documentation](https://www.tools.cn/docs/)

[API](https://apidoc.gitee.com/loolly/tools/)

[Video](https://www.bilibili.com/video/BV1bQ4y1M7d9?p=2)

-------------------------------------------------------------------------------

## Install

### Maven
```xml
<dependency>
    <groupId>com.tools</groupId>
    <artifactId>tools-all</artifactId>
    <version>5.4.5</version>
</dependency>
```

### Gradle
```
compile 'com.tools:tools-all:5.4.5'
```

## Download

- [Maven1](https://repo1.maven.org/maven2/cn/tools/tools-all/5.4.5/)
- [Maven2](http://repo2.maven.org/maven2/cn/tools/tools-all/5.4.5/)

> note:
> tools 5.x supports JDK8+ and is not tested on Android platforms, and cannot guarantee that all tool classes or tool methods are available.
> If your project uses JDK7, please use tools 4.x version.

### Compile and install

Download the entire project source code

gitee：[https://gitee.com/loolly/tools](https://gitee.com/loolly/tools) 

github:https://github.com/looly/tools

```sh
cd ${tools}
./tools.sh install
```

-------------------------------------------------------------------------------

## Other

### Branch Description

tools's source code is divided into two branches:

| branch | description                                               |
|-----------|---------------------------------------------------------------|
| v5-master | The master branch, the branch used by the release version, is the same as the jar committed to the central repository and does not receive any pr or modifications. |
| v5-dev    | Development branch, which defaults to the next SNAPSHOT version, accepts modifications or pr |

### Provide feedback or suggestions on bugs

When submitting feedback, please indicate which JDK version, tools version, and related dependency library version you are using.

- [Gitee issue](https://gitee.com/loolly/tools/issues)
- [Github issue](https://github.com/looly/tools/issues)

### Principles of PR(pull request)

tools welcomes anyone to contribute code to tools, but the author suffers from OCD and needs to submit a pr (pull request) that meets some specifications in order to care for the patient.：

1. Improve the comments, especially each new method should follow the Java documentation specification to indicate the method description, parameter description, return value description and other information, if necessary, please add unit tests, if you want, you can also add your name.
2. Code indentation according to Eclipse.
3. Newly added methods do not use third-party library methods，Unless the method tool is added to the '**extra module**'.
4. Please pull request to the `v5-dev` branch. tools uses a new branch after 5.x: `v5-master` is the master branch, which indicates the version of the central library that has been released, and this branch does not allow pr or modifications.

-------------------------------------------------------------------------------

## Donate

If you think tools is good, you can donate to buy tshe author a pack of chili~, thanks in advance ^_^.

[gitee donate](https://gitee.com/loolly/tools)
