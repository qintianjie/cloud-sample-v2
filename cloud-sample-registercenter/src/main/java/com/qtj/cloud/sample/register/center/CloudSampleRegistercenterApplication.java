package com.qtj.cloud.sample.register.center;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CloudSampleRegistercenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudSampleRegistercenterApplication.class, args);
	}
}
