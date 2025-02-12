package com.flm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceRegistryJan31Application {

	public static void main(String[] args) {
		SpringApplication.run(ServiceRegistryJan31Application.class, args);
	}

}
