package com.qtj.cloud.sample.register.center;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.sleuth.zipkin.stream.EnableZipkinStreamServer;
import org.springframework.context.annotation.ComponentScan;

import com.qtj.cloud.sample.register.center.config.BizConsumerRibbonConfiguration;

/**
 * hystrix 步骤：
 * 	1. start the service.
 *  2. open dashboard
 *  	2.1 http://localhost:8090//hystrix
 *  	2.2 input http://localhost:8090/hystrix.stream  --> Monitor Stream 
 *  
 *  		will got "Unable to connect to Command Metric Stream."
 *  3. http://localhost:8090/hello
 *  4. redo 2
 *  
 *  5. click [ http://localhost:8093/hello  http://localhost:8093/hello/say  ] all time to visit.  
 *  
 * @author Duoduo (tianjieqin@126.com)
 * @date   2016年12月7日-下午10:10:01
 *
 */

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "colorcc-sample-consumer-ribbon", configuration = BizConsumerRibbonConfiguration.class)
@EnableZipkinStreamServer
@EnableCircuitBreaker
@EnableHystrixDashboard
@ComponentScan("com.qtj.cloud.sample.register.center.resource.service.impl")
@ComponentScan("com.qtj.cloud.sample.register.center.resource")
public class CloudSampleConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudSampleConsumerApplication.class, args);
	}
}
