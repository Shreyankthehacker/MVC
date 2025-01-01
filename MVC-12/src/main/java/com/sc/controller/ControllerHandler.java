package com.sc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class ControllerHandler {

	@GetMapping("/")
	public String homePage() {
		return "homePageDef";
	}
	
	
}
