package com.astro.sample.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.astro.sample.entity.Employee;
import com.astro.sample.service.EmployeeService;

@RestController
@RequestMapping("/astro-demo")
public class SampleController {
	
	@Autowired
	EmployeeService employeeService;
	
	@Autowired
	Employee employee;
	
	private static final Logger LOG = LoggerFactory.getLogger(SampleController.class);
	
	@GetMapping("/{id}")
	public Employee findDataById(@PathVariable("id") Long employeeId) {
		
		LOG.info("started: SampleController.findDataById() method");

		try {
		
			employee = employeeService.findByemployeeId(employeeId);
			
		} catch (Exception e) {
			LOG.error("Exception Occurred.");
		}
		return employee;
		
		
	}

}
