package com.example.docker.SpringbootDocker.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SprintBootDockerController {

	
	@GetMapping
	public String hello() {
		for (int i = 0; i < 4; i++) {
		
			System.out.println("Print message for 5 times");
			
		}
		return "Hello from AWS Spring Boot Docker";
	}
}
