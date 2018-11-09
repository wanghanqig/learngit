package com.zsfund.Eurake;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class StartUp {
	public static void main(String[] args) {
		SpringApplication.run(StartUp.class, args);
	}

}
