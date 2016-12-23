/**
 * 
 */
package com.qtj.cloud.sample.register.center.resource.service.impl;

import java.util.Random;

import org.springframework.stereotype.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.qtj.cloud.sample.register.center.resource.service.HelloResourceService;

/**
 * @author Duoduo (tianjieqin@126.com)
 * @date   2016年12月23日-上午7:41:24
 *
 */

@Service
public class HelloResourceServiceImpl implements HelloResourceService {

	/* (non-Javadoc)
	 * @see com.qtj.cloud.sample.register.center.resource.service.HelloResourceService#helloByCircuitB(java.lang.String)
	 */
	@Override
	@HystrixCommand(fallbackMethod="fallback")
	public String helloByCircuitB(String name) {
		Random random = new Random();
		int nextInt = random.nextInt(10);
		System.out.println("Random value : " + nextInt);
		if (nextInt > 6) {
			return name;			
		} else {
			throw new RuntimeException("Value less 6");
		}
	}

	public String fallback() {
		return "Value less 7.";
	}

}
