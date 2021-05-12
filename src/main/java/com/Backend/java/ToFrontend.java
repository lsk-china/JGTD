package com.Backend.java;
public interface ToFrontend{
	//返回时间检查
	String ToCheck();
	//返回文件显示
	String ToShowManagerFile();
	//返回获取系统时间
	String ToSystemTime();
	//返回文件处理
	String ToManagerFile();
	//配置文件的修改 Changewhat表示修改的选项，change是修改的布尔值
	String ChangeConfig(String Changewhat,boolean change);
}
