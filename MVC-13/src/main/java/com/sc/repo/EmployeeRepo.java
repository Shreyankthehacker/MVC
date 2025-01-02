package com.sc.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sc.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

}

