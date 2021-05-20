package com.spring.basic.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/auth")
public class SecurityController {
	
	
	@GetMapping("/getmessage")
	public String webflux(){
		return "Response";
	}
}
