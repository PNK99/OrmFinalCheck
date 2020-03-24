package com.cognizant.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.models.Employee;

public interface EmployeeRepository extends JpaRepository<Employee	, Integer> {

}
