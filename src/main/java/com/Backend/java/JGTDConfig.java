package com.Backend.java;


import java.io.*;

import java.util.logging.Logger;

public class JGTDConfig {
	static final Logger log_JGTDConfig = Logger.getLogger("log_JGTDConfig");

	/*
	需写入的配置文件
	 */
	public String file_config = new StringBuilder().append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n").append("<config>\n").append("\t<SetVersion>\n").append("\t\t<StableVersion select = \"true\" />\n").append("\t\t<Pre_Version select = \"false\" />\n").append("\t</SetVersion>\n").append("\t<language>\n").append("\t</language>\n").append("</config>").toString();


	private String dir_path = "./JGTDConfig.xml";
	/*
	初始化配置文件
	 */
	public void InitFile() throws IOException {

		//创建文件

		File CreatConfig = new File("./JGTDConfig.xml");
		try{
			CreatConfig.createNewFile();
		}catch(IOException e){
			log_JGTDConfig.severe("初始化过程出错");

		}

		/*
		写入文件
		 */
		BufferedWriter file_write = null;
		try {
			file_write = new BufferedWriter(new FileWriter(dir_path));
			file_write.write(file_config);
		} catch (IOException e) {
			log_JGTDConfig.severe("无法写入");
		} finally {
			if (file_write != null) {
				try {
					file_write.close();
				} catch (IOException e) {
					log_JGTDConfig.warning("无法清除资源占用");
				}
			}
		}
	}

	public String ConfigString;

	public String ReadConfig() throws IOException {
		//读取文件
		BufferedReader path = null;
		//尝试
		try{
			path = new BufferedReader(new FileReader(dir_path));
			ConfigString=path.readLine();
		}catch(IOException e){
			InitFile();
		}finally{
			//清除内存
			if (path != null){
				try{
					path.close();
				}catch(IOException e){
					log_JGTDConfig.warning("无法清除资源占用");
				}
			}
		}
		return ConfigString;
	}
}