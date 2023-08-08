package com.fuerzadon.demo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fuerzadon.demo2.service.AppService;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class Demo2Application {
	
	//This is for create a new beans, it's not necessary for inint and run a new springboot project
	private final AppService appService;
	
	
	//This is for create a new beans, it's not necessary for inint and run a new springboot project
	public Demo2Application(AppService appService) {
		this.appService = appService;
	}
	

	public static void main(String[] args) {
		SpringApplication.run(Demo2Application.class, args);
	}
	
	
	//This is for create a new beans, it's not necessary for inint and run a new springboot project
	@PostConstruct
	public void doExamples() {
        System.out.println("Calling bean method with this result: " +  appService.calculate(123));
    }

}
