package com.cognizant.services;



import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.models.Department;
import com.cognizant.repositories.DepartmentRepository;

@Service
public class DepartmentService {
	@Autowired
	private DepartmentRepository departmentRepo;

	@Transactional
	public void save(Department department) {
		departmentRepo.save(department);
	}
	
	@Transactional
	public Department get(Integer id) {
		return departmentRepo.findById(id).get();
	}

}