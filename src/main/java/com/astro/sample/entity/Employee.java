package com.astro.sample.entity;

import org.springframework.stereotype.Component;

@Component
public class Employee {

	private Long employeeId;
	private String employeeName;
	
	public Employee(Long employeeId, String employeeName) {
		
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}
	
	public Employee() {
		
	}

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + "]";
	}

	
	
}
