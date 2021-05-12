//检查指定的任务是否到时间
//如果到时间了就返回值到前端
package com.Backend.java;

import java.io.*;
import java.util.logging.*;

public class check_time{
	static final Logger log_check_time = Logger.getLogger("check_time");
	

	//number_ManagerFile是获取指定的 ManagerFile_TODO 的索引位置
	
	
	public String check_time_server(int number_ManagerFile) throws IOException{

		//
		//文件格式
		//#DATE##TODO
		//初始化类TimeFileManager
		String ManagerFile;
		TimeFileManager use_TimeFileManager = null;
	    use_TimeFileManager	= new TimeFileManager();

		//读取Manager文件，并保存信息到ManagerFile
		ManagerFile = use_TimeFileManager.ReadFile();

		//拆分以获取信息
		String [] ManagerFile_time = ManagerFile.split("#");
		//String [] ManagerFile_TODO = ManagerFile_time[number_ManagerFile].split("##");

		//获取当前时间
		var use_GetTime = new GetTime();
		String SystemTime;
		SystemTime = use_GetTime.GetSystemTime();

		//截取时间
		String ToIf = ManagerFile.substring(ManagerFile_time[number_ManagerFile].indexOf("")+1, ManagerFile_time[number_ManagerFile].indexOf("##"));

		if (SystemTime == ToIf){
			return "yes";
		}
		return "no";
	}	
}
