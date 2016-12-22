package com.qtj.cloud.sample.register.center;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

import com.qtj.cloud.sample.register.center.config.BizConsumerRibbonConfiguration;

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "colorcc-sample-consumer-ribbon", configuration = BizConsumerRibbonConfiguration.class)
public class CloudSampleConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudSampleConsumerApplication.class, args);
	}
}
