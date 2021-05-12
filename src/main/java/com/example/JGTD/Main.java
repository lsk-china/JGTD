package com.example.JGTD;

import java.io.IOException;

import java.util.logging.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;



/*
 * 不链接数据库
 */
@SpringBootApplication


public class Main extends SpringBootServletInitializer{
	

	static final Logger log_JGTD = Logger.getLogger("JGTD");

	public static void main(String[] args) throws IOException {
		SpringApplication.run(Main.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(this.getClass());
	}
}