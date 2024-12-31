package com.sc.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ControllerMapping {

	
	@GetMapping("/")
	public String getHomePage() {
		return "home";
	}
	
	
	@GetMapping("/print")
	public String display(Map<String,Object>mp) {
		mp.put("msg", "Hello welcome to the website");
		return "display";
	}

	
	
}
