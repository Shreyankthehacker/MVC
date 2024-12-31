package com.sc.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sc.model.Employee;

public interface EmpRepo extends JpaRepository<Employee, Integer> {

}
