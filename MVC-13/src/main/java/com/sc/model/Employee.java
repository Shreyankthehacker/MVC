package com.sc.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Table(name = "emp")
@Data
public class Employee {

	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer emp_id;
	private String job,name,salary;
	
}
