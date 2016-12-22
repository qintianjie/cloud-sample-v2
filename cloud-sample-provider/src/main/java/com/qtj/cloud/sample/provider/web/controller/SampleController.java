package com.qtj.cloud.sample.provider.web.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.qtj.cloud.sample.service.SampleService;

@RestController
@RequestMapping("/sample")
public class SampleController {
	
	@Autowired
	SampleService sampleService;
	
	@GetMapping("/name")
	public String sample(@RequestParam("name") String name) {
		if (StringUtils.isBlank(name)) {
			return sampleService.sample();
		} else {
			return sampleService.sample(name);
		}
	}

}
