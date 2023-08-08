package com.fuerzadon.demo2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fuerzadon.demo2.service.MultiplierService;

@Configuration
public class AppConfig {
	
	@Bean(name = {"multiplierService", 
            "multiplierService-alias1", "multiplierService-alias2"},
			initMethod ="init", destroyMethod = "destroy")
	public MultiplierService multiplier() {
		return new MultiplierService(2);
	}
}
