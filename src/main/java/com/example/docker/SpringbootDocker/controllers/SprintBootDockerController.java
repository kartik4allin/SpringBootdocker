package com.example.docker.SpringbootDocker.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SprintBootDockerController {

	
	@GetMapping
	public String hello() {
		return "Hello from AWS Spring Boot Docker";
	}
}
