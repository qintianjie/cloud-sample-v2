package com.qtj.cloud.sample.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.sleuth.zipkin.stream.EnableZipkinStreamServer;
import org.springframework.context.annotation.Bean;

import com.qtj.cloud.sample.zuul.config.BizConsumerRibbonConfiguration;
import com.qtj.cloud.sample.zuul.filter.SimpleFilter;

/**
 * http://localhost:8763/hello/v2/hr/cb/name
 * 
 * @author qtj
 *
 */

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
@EnableZipkinStreamServer
@RibbonClient(name = "cloud-sample-gateway", configuration = BizConsumerRibbonConfiguration.class)
public class CloudSampleZuulApplication {
	
	@Bean
	public SimpleFilter simpleFilter() {
		return new SimpleFilter();
	}

	public static void main(String[] args) {
		SpringApplication.run(CloudSampleZuulApplication.class, args);
	}
}
