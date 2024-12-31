package com.sc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sc.model.Employee;
import com.sc.repo.EmpRepo;

@Service
public class EmpService {

	@Autowired
	private EmpRepo repo;
	
	public List<Employee> getAllEmp(){
		return repo.findAll();
	}
	
public void register(Employee emp) {
	repo.save(emp);
}
	
}
