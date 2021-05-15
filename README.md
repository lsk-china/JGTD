# JGTD

## 简介

NSCAI发布的《最终报告》让我对选用java进行开发产生怀疑，暂不清楚会不会禁用中国的JDK（包括OpenJDK）。暂时先观望。如有必要会转Rust(本人最喜欢的科技公司)或者C(使用时间最久的语言)。也就可惜了我这花了300块钱的Java核心技术，本人初二，这钱相对来说算多了。

这个项目是受 https://github.com/NothingLeftProject/NothingLeft-Backend   的启发。

本项目将会使用使用纯Java编写。

## 本软件提供自行规划时间，在制定时间里不允许操作PC以及日历的功能。

## 开发分支要求

以基于最新dev分支创建以自己的GitHub昵称作为分支，然后申请合并到dev，每月月底都会将dev合并到master分支

# 参与开发（约束）

请使用SpringBoot打包：mvn clean package  -Dmaven

开发测试前端请用：npx vue-cli-service serve

仅允许在修复小BUG的时候强推（强行推送）

使用OpenJDK最新版本

# 打包

所有组件测试完毕后，才可进行打包环节

生成前端的包 ：npm run build （运行后生成的东西都放在dist文件夹里）

把dist里的所有内容均放置在JGTD\src\main\resources文件夹中

然后生成整个程序的包：mvn clean package  -Dmaven

# 更新日志

详细请看git信息

# 使用方法

1.运行jar包

2.打开网页[localhost](http://localhost:8080/)

3.使用

#  TODO

1. Swing前端