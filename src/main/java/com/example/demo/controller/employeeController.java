package com.example.demo.controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.ModelMap;
import com.example.demo.model.employee;
import com.example.demo.service.employeeService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


@Controller
public class employeeController {
	
	@Autowired
	employeeService empServ;
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	@RequestMapping("/create")
	public String create() {
		return "create";
	}
	@RequestMapping("saveEmp")
	public String saveEmp(@ModelAttribute("emp") employee emp, ModelMap modelMap) {
		employee saveEmployee=empServ.saveEmployee(emp);
		String message="Employee saved with Name: "+saveEmployee.getName();
		modelMap.addAttribute("mess",message);
		return "create";
	}
	@RequestMapping("disEmp")
	public String disEmp(ModelMap modelMap) {
		
		List<employee> employee=empServ.displayEmployee();
		modelMap.addAttribute("employee",employee);
		return "display";
	}
	@RequestMapping("upEmp")
	public String upEmp(@RequestParam("name") String nm,@RequestParam("dept") String dpt, ModelMap modelMap) {
		
		modelMap.addAttribute("name",nm);
		modelMap.addAttribute("dept",dpt);
		return "update";
	}
	@RequestMapping("updatedEmp")
	public String updatedEmp(@ModelAttribute("emp") employee emp, ModelMap modelMap) {
		employee upEmployee=empServ.updateEmployee(emp);
		String message="Employee saved with Name: "+upEmployee.getName();
		modelMap.addAttribute("mess",message);
		return "display";
	}
	@RequestMapping("deleteEmp")
	public String deleteEmp(@RequestParam("name") String name, ModelMap modelMap) {
		employee selectEmployee=empServ.getEmployee(name);
		String message= empServ.deleteEmployee(selectEmployee);
		modelMap.addAttribute("mess",message);
		return "display";
	}
	
}
