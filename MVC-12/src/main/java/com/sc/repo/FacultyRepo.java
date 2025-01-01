package com.sc.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sc.model.Faculty;

public interface FacultyRepo  extends JpaRepository<Faculty, Integer>{

}
