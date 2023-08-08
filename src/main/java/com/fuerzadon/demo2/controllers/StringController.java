package com.fuerzadon.demo2.controllers;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringController {
	
	@GetMapping("/")
	public String sayHello() {
		return "Hello world! Time on server is + " + LocalDateTime.now();
	}
	
	@GetMapping("/reverse/{word}")
	public String reverseString(@PathVariable String word) {
		char chs[] = word.toCharArray(), ch1;
		int size = chs.length/2;
		
		for(int x=0; x<size; x++) {
			ch1 = chs[word.length()-1-x];
			chs[word.length()-1-x] = chs[x];
			chs[x] = ch1;
		}
		
		return new String(chs);
	}
	
}
