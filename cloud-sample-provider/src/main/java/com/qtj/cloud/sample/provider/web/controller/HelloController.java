package com.qtj.cloud.sample.provider.web.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.qtj.cloud.sample.service.HelloService;


@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@Value("${server.port}")
	private String port;
	
	@Autowired
	HelloService helloService;
	
	@GetMapping("/name")
	public String hello(@RequestParam(value="name", required=false) String name) {
		if (StringUtils.isBlank(name)) {
			return helloService.hello(port);
		} else {
			return helloService.hello(name + " - " + port);
		}
	}

}
