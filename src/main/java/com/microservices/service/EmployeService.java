package com.microservices.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import com.microservices.entity.Employee;
import com.microservices.repository.EmployeRespository;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeService {
	@Autowired
	EmployeRespository employeRespository; 

	public Employee save(Employee employee) {
		
		return employeRespository.save(employee);
	}

    public List<Employee> getall() {
		List<Employee>employees=null;
		Iterable<Employee> employeess=employeRespository.findAll();
		 employeess.forEach(employees::add);
		 return  employees;

    }

	public Employee getbyit(int id) {
		return employeRespository.findById(id).get();
	}

	public Employee findone(int id) {
		Employee employee=new Employee();
		ExampleMatcher matcher = ExampleMatcher.matching() // You can configure the matching options
				.withMatcher(String.valueOf(id), ExampleMatcher.GenericPropertyMatchers.exact());

		Example<Employee>employeeExample= Example.of(employee,matcher);

		 employeRespository.findOne(employeeExample);

		return employeRespository.findOne(employeeExample).get();
	}}

