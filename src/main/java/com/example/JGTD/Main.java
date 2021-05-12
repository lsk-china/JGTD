package com.example.JGTD;


import com.Backend.java.JGTDConfig;
import com.Backend.java.StartFrontend;
import java.io.IOException;

import java.util.logging.Logger;



/*
@author Cpointerz(RuiGang Zhang)
*/
class Main{

	static final Logger log_JGTD = Logger.getLogger("JGTD");

	public static void main(String[] args) throws IOException {

		/*
		无配置文件就初始化
		有配置文件就读取
		 */

		var Config = new JGTDConfig();
		try{
			Config.ReadConfig();
		}catch (IOException e){
			log_JGTD.severe("无法读取/初始化配置文件");
		}

		//启动前端服务
		new StartFrontend();
	}
}