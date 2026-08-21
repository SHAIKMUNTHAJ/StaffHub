package com.Microservice.Employee.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.Microservice.Employee.Repo.EmployeeRepo;
import com.Microservice.Employee.model.Employee;
import com.Microservice.Employee.response.AddressResponse;
import com.Microservice.Employee.response.EmployeeResponse;

@Service
public class EmployeeService {
	@Autowired
	EmployeeRepo employeeRepo;
	@Autowired
    ModelMapper model;
	@Autowired
	RestTemplate restTemplate;
	 public List<Employee> getEmployeelist(){
		 return employeeRepo.findAll();
		 
	 }
 public EmployeeResponse getEmployeeById(Integer id) {
	Employee employee=employeeRepo.findById(id).orElseThrow();
	EmployeeResponse employeeResponse=model.map(employee,EmployeeResponse.class );
	AddressResponse addressResponse=restTemplate.getForObject("http://localhost:9191/api/v1/add/{id}", AddressResponse.class,id);
	employeeResponse.setAddressReponse(addressResponse);
	return employeeResponse;
 }

}
