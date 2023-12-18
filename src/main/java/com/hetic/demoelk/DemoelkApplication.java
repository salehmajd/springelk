package com.hetic.demoelk;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoelkApplication {

	public static void main(String[] args) {
		Logger logger = LogManager.getLogger(DemoelkApplication.class);
		SpringApplication.run(DemoelkApplication.class, args);
		logger.log(Level.INFO, "Starting spring-boot application");
	}

}
