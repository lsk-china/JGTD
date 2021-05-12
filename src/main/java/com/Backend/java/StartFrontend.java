/*
Main启动StartFrontend（本程序）后，再通过StartFrontendServer启动前端服务
*/
package com.Backend.java;
import com.Frontend.java.StartFrontendServer;

public class StartFrontend{
	public StartFrontend(){
		new StartFrontendServer();
	}
}
