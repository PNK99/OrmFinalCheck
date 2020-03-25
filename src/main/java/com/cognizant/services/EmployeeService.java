package com.cognizant.services;

import java.util.List;

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
	
	
	@Transactional
	public List<Employee> getAllPermanentEmployees(){
		return employeeRepo.getAllPermanentEmployees();
	}
	
	@Transactional
	public List<Employee> getAllEmployeesNative(){
		return employeeRepo.getAllEmployeesNative();
	}
	
	@Transactional
	public double getAverageSalary(int id){
		return employeeRepo.getAverageSalary(id);
	}
	
	
	

}