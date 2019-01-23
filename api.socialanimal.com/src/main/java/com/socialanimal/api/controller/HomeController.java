package com.socialanimal.api.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HomeController {

	@Value("${url.data}")
	private String urlData;
	
	private static final Logger log = LoggerFactory.getLogger(HomeController.class);
	
	@GetMapping("/home")
	public String getHome() {
		
		RestTemplate restTemplate = new RestTemplate();
        String dataValue = restTemplate.getForObject(urlData, String.class);
        log.debug("Hello from API \n" + dataValue);
		return "Hello from API <br>" + dataValue;
	}
}
