package com.sc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sc.model.Employee;
import com.sc.repo.EmployeeRepo;

@Service
public class EmployeeService {

	
	@Autowired
	private EmployeeRepo repo;
	
	
public List<Employee> getAllEmployee(){
	return repo.findAll();
}

public void register(Employee emp) {
	 repo.save(emp);
}
	

public Employee getEmp(Integer id) {
	return repo.findById(id).get();
}


public void update(Employee emp) {
	delete(emp);
	repo.save(emp);
	
}

public void delete(Employee emp) {
	repo.delete(getEmp(emp.getEmp_id()));
}

}
