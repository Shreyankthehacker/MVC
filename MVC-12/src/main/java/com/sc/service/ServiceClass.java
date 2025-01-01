package com.sc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sc.model.Faculty;
import com.sc.repo.FacultyRepo;

@Service
public class ServiceClass {

	
	@Autowired
	private FacultyRepo repo;
	
	public List<Faculty> getAllFaculty(){
		return repo.findAll();
	}
	
	
	
}
