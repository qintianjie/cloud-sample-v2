package com.qtj.cloud.sample.trace.center;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.sleuth.zipkin.stream.EnableZipkinStreamServer;

@SpringBootApplication
@EnableZipkinStreamServer
@EnableEurekaClient
public class CloudSampleTracecenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudSampleTracecenterApplication.class, args);
	}
}
