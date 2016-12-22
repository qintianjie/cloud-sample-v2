package com.qtj.cloud.sample.service.impl;

import com.qtj.cloud.sample.service.HelloService;

public class HelloServiceImpl implements HelloService {

	@Override
	public String hello() {
		return "Hello Spring Cloud.";
	}

	@Override
	public String hello(String name) {
		if (name == null) {
			name = " [Default Name] ";
		}
		return "Hello " + name;
	}

}
