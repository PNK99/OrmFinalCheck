package com.cognizant.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.models.Employee;
import com.cognizant.repositories.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepo;

	@Transactional
	public void save(Employee employee) {
		employeeRepo.save(employee);
	}

	@Transactional
	public Employee get(Integer id) {
		return employeeRepo.findById(id).get();
	}

}