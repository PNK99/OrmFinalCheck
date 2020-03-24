package com.cognizant.models;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="dp_id")
	private Integer id;
	
	@Column(name="dp_name")
	private String name;
	
	@OneToMany(mappedBy = "department",fetch = FetchType.EAGER)
	private Set<Employee> employeeList;
  
}
