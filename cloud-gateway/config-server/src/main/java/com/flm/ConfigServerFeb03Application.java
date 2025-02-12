package com.flm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerFeb03Application {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerFeb03Application.class, args);
	}

}
