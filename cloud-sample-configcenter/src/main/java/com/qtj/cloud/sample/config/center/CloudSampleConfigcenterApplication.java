package com.qtj.cloud.sample.config.center;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * http://localhost:8672/cloud-sample/default 
 * @author qtj
 *
 */

@SpringBootApplication
@EnableConfigServer
public class CloudSampleConfigcenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudSampleConfigcenterApplication.class, args);
	}
}
