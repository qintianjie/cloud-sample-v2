package com.qtj.cloud.sample.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CloudSampleProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudSampleProviderApplication.class, args);
	}
}
