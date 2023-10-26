package com.microservices.serviceresistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceresistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceresistryApplication.class, args);
	}

}
