package com.qtj.cloud.sample.provider.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.qtj.cloud.sample.service.HelloService;
import com.qtj.cloud.sample.service.SampleService;
import com.qtj.cloud.sample.service.impl.HelloServiceImpl;
import com.qtj.cloud.sample.service.impl.SampleServiceImpl;

@Configuration
public class AppConfig {
	
	@Bean
	public HelloService helloService(){
		return new HelloServiceImpl();
	};
	
	@Bean
	public SampleService sampleService(){
		return new SampleServiceImpl();
	};

}
