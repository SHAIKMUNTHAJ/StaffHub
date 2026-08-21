package com.Microservice.Employee.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Microservice.Employee.model.Employee;
@Repository	
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

	

}
