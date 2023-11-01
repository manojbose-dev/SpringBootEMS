package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.model.employee;
import com.example.demo.repo.employeeRepo;


@SpringBootTest
class EmployeeManagementApplicationTests {
	@Autowired
	private employeeRepo empRepo;
	
	@Test
	public void newEmp()
	{
		employee em=new employee();
		em.setName("Rahul Das");
		em.setDept("PRS");
		empRepo.save(em);
	}

}
