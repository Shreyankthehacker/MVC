package com.sc.controller;

import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sc.model.Employee;
import com.sc.service.EmployeeService;


@Controller
@RequestMapping("/employee") // GlbbalPath
public class ControllerMapping {
	
	@Autowired
	private EmployeeService service;

	@GetMapping("/")
	public String getHome() {
		System.out.println("getHome");
		return "home";
	}
	
	@GetMapping("/report")
	public String getreport(Map<String,Object>mp) {
	    mp.put("empsList", service.getAllEmployee());
	    return "employee_report";
	}
	
	@GetMapping("/add")
	public String addEmp(@ModelAttribute("emp")Employee employee) {
		return "add_employee";
	}
	
	@PostMapping("/add")
	public String postAdd(@ModelAttribute("emp")Employee employee ){
		service.register(employee);
		
		return "redirect:/report";
	}
	
	@GetMapping("/edit")
	public String getedit(@RequestParam("eno")Integer eno,@ModelAttribute("emp")Employee newEmp) {
		Employee oldEmp = service.getEmp(eno);
		BeanUtils.copyProperties(newEmp, oldEmp);
		return "modify_employee";
	}
	
	@PostMapping("/edit")
	public String postEdit(@ModelAttribute("emp")Employee newEmp) {
		service.update(newEmp);
		return "redirect:/report";
	}
	
	@GetMapping("/delete")
	public String getdelete(@ModelAttribute("emp")Employee employee) {
		service.delete(employee);
		return "redirect:/report";
	}
	
	
	
}
