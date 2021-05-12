//文件MANAGER的管理
//负责创建，修改
package com.Backend.java;

import java.io.*;
import java.util.logging.Logger;
public class TimeFileManager {
   static final Logger log_timemanager = Logger.getLogger("TimeFileManager");
   String file_textString; 
   
   private String filename = "MANAGER";
   private String dir = "./";
   private String dir_path = "./MANAGER.md";
   public void CreatFile() throws IOException {
      //创建文件
	   File CreatManager = new File("./MANAGER.xml");
	   try{
		   CreatManager.createNewFile();
	   }catch(IOException e){
		   log_timemanager.severe("初始化过程出错");
	   }
   }
   public String ReadFile () throws IOException {
	   //读取文件
	   BufferedReader path = null;
	   //尝试
	   try{
		   path = new BufferedReader(new FileReader(dir_path));
		   file_textString=path.readLine();
	   }catch(IOException e){
		   log_timemanager.severe("没有找到MANAGER.xml;无法写入");
	   }finally{
		   //清除内存
		   if (path != null){
			   try{
				   path.close();
			   }catch(IOException e){
				   log_timemanager.warning("无法清除资源占用");
			   }
		   }
	   }
	   return file_textString;
   }
   //关于写入文件的方法
   public void SaveFile(String file_textString) throws IOException{
	   BufferedWriter file_write = null;
	   try {
		   file_write = new BufferedWriter(new FileWriter(dir_path));
		   file_write.write(file_textString);
	   }catch(IOException e){
		   log_timemanager.warning("没有找到MANAGER.xml;无法写入");
	   }finally{
		   if (file_write != null){
			   try{
				   file_write.close();
			   }catch(IOException e){
				   log_timemanager.warning("无法清除资源占用");
			   }
		   }
	   }
   }
}
