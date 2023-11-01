package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.employee;
import com.example.demo.repo.employeeRepo;

@Service
public class employeeServiceImp implements employeeService {
	@Autowired
	private employeeRepo empRepo;
	@Override
	public employee saveEmployee(employee emp) {
		// TODO Auto-generated method stub
		return empRepo.save(emp);
	}
	
	public employee updateEmployee(employee emp) {
		// TODO Auto-generated method stub
		return empRepo.save(emp);
	}

	public String deleteEmployee(employee emp) {
		// TODO Auto-generated method stub
		empRepo.delete(emp);
		
		return "Deleted Successfully";
		}
	public List<employee> displayEmployee() {
		// TODO Auto-generated method stub		
		return empRepo.findAll();
	}
	public employee getEmployee(String name) {
		// TODO Auto-generated method stub
		return empRepo.findById(name).orElse(null);
	}
}
