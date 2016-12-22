package com.qtj.cloud.sample.service.impl;

import com.qtj.cloud.sample.service.SampleService;

public class SampleServiceImpl implements SampleService {

	@Override
	public String sample() {
		return "Sample SpringCloud.";
	}

	@Override
	public String sample(String name) {
		if (name == null) {
			name = " [Default Name] ";
		}
		return "Sample " + name;
	}

}
