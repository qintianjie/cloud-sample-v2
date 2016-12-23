package com.qtj.cloud.sample.register.center.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.qtj.cloud.sample.register.center.resource.service.HelloResourceService;

@RestController
@RequestMapping("/v2/hr")
public class HelloResourceV2 {
	
	@Value("${provider.name}")
    private String providerName; 
	
	public String getProviderName() {
		return providerName;
	}

	@Autowired
	@Qualifier("restTemplateLB")
	RestTemplate restTemplate;
	
	@Autowired
	HelloResourceService helloResourceService;
	
	@GetMapping("/name")
	public String hello(@RequestParam(value="name", required=false, defaultValue="") String name) {
		String reqUrl = "http://" + this.getProviderName() + "/hello/name?name={name}";
		String response = restTemplate.getForObject(reqUrl, String.class, name);
		return response;
	}
	
	@GetMapping("/cb/name")
	public String helloCircuitBreaker(@RequestParam(value="name", required=false, defaultValue="") String name) {
		String reqUrl = "http://" + this.getProviderName() + "/hello/name?name={name}";
		String nameByCircuitB = helloResourceService.helloByCircuitB(name);
		String response = restTemplate.getForObject(reqUrl, String.class, nameByCircuitB);
		return response;
	}
}
