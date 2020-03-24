package com.cognizant.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.models.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {

}
