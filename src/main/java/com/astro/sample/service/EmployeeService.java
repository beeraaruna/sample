package com.astro.sample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.astro.sample.entity.Employee;

@Service
public class EmployeeService {
	
	@Autowired
	Employee employee;
	
public Employee findByemployeeId(Long employeeId) {
		
	employee.setEmployeeId(employeeId);
	employee.setEmployeeName("Hi Arun");
		return employee;
	}

}
