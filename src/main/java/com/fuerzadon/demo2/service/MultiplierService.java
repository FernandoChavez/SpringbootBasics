package com.fuerzadon.demo2.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MultiplierService {
	private final int multiplier;
	
	Logger logger = LoggerFactory.getLogger(MultiplierService.class);
	
	public MultiplierService(int multiplier) {
		this.multiplier = multiplier;
	}
	
	public int multiply(int value) {
		return value * multiplier;
	}
	
	public void init() {
		logger.info("Calling init method :)");
	}
	
	public void destroy() {
		logger.info("Calling destroy method :(");
	}
}
