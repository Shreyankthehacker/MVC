package com.sc.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sc.model.Employee;
import com.sc.service.EmpService;

@Controller

public class EmpController {

	
	@Autowired
	private EmpService service;
	
	
	@GetMapping("/")
	public String showHome() {
		return "home";
	}
	
	
	@GetMapping("/report")
	public String generateReport(@RequestParam("type")String type , Map<String,Object>mp) {
		List<Employee> list = service.getAllEmp();
		mp.put("empsList", list);
		if(type.equalsIgnoreCase("pdf"))return "pdfreport";
		return "excelreport"; // These arent normal jsp but are java view comps hence returning the bean name 
	}
}
