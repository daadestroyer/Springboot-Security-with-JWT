package com.daadestroyer.springsecurityjwt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/welcome")
	public String home() {
		String text = "this is private page ";
		text += "this page is not allowed to unauthenticated users";
		return text;
	}
	
	@GetMapping("/getusers")
	public String getusers() {
		
		return "{\"name\":\"shubham\"}";
	}
}
