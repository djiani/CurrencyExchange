package com.virtusa.microservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.virtusa.microservices.bean.LimitsConfiguration;
import com.virtusa.microservices.configuration.Configuration;

@RestController
public class LimitsConfigurationController {
	
	@Autowired
	private Configuration config; 
	
	@GetMapping("/limits")
	public LimitsConfiguration retrieveLimitsFromConfiguration() {
		
		return new LimitsConfiguration(config.getMaximum(), config.getMinimum());
		
	}

}
