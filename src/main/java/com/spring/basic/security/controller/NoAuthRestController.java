package com.spring.basic.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class NoAuthRestController {
	
	
	@GetMapping("/noauth")
	public String noauth() {
		return "No-Auth";
	}

}
