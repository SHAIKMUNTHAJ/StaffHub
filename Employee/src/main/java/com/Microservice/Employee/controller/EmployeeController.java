package com.Microservice.Employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Microservice.Employee.model.Employee;
import com.Microservice.Employee.response.EmployeeResponse;
import com.Microservice.Employee.service.EmployeeService;

@RestController
@RequestMapping("api/v1")
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	@GetMapping("empList")
	List<Employee>getEmployees(){
		return employeeService.getEmployeelist();
	}
	
	@GetMapping("emp/{id}")
	EmployeeResponse getEmployeeId(@PathVariable Integer id) {
		return employeeService.getEmployeeById(id);
		
	}

}
