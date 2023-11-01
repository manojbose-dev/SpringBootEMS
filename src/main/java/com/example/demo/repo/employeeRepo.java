package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.employee;

public interface employeeRepo extends JpaRepository<employee, String> {

}
