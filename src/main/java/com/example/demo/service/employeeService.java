package com.example.demo.service;

import java.util.List;

import com.example.demo.model.employee;

public interface employeeService {
	
	employee saveEmployee(employee emp);
	employee updateEmployee(employee emp);
	String deleteEmployee(employee emp);
	List<employee> displayEmployee();
	employee getEmployee(String name);
	


}
