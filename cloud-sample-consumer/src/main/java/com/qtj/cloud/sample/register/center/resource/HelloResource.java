package com.qtj.cloud.sample.register.center.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/hr")
public class HelloResource {
	
	private static final String URL_PREFIX = "http://localhost:8090";
	
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/name")
	public String hello(@RequestParam(value="name", required=false, defaultValue="") String name) {
		String reqUrl = URL_PREFIX + "/hello/name?name={name}";
		String response = restTemplate.getForObject(reqUrl, String.class, name);
		return response;
	}
}
