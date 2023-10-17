package com.microservices.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.microservices.entity.Employee;
import com.microservices.pojo.EmployeeEntity;
import com.microservices.service.EmployeService;

import java.util.List;

@RestController
@RequestMapping("crud")
public class userController {
	@Autowired
	EmployeService employeService;
	@PostMapping("create")
	public ResponseEntity<Employee>saveoperation(@RequestBody Employee employee){
		return new ResponseEntity<Employee>( employeService.save(employee),HttpStatus.CREATED);
	}


	@PutMapping("update")

	public ResponseEntity<Employee>update(@RequestBody Employee employee){
			return new ResponseEntity<>(employeService.save(employee),HttpStatus.CREATED);
		}
		@GetMapping("get-all")
		public ResponseEntity<List<Employee>>getall(){
		return new ResponseEntity<>(employeService.getall(),HttpStatus.ACCEPTED);
		}
		@GetMapping("Getby-id/{id}")
		public ResponseEntity<Employee>getbyid(@PathVariable int id){
		return new ResponseEntity<>(employeService.getbyit(id),HttpStatus.CREATED);
		}


	@PatchMapping("patch/{id}")
		public ResponseEntity<Employee>patch(@PathVariable int id,@RequestBody Employee employee){
		Employee getbyidemploye
				=employeService.getbyit(id);
		getbyidemploye.setName(employee.getName());
		getbyidemploye.setEmail(employee.getEmail());

		//patch mapping is combination of getbyid and update se but
		return new ResponseEntity<>(employeService.save(getbyidemploye),HttpStatus.CREATED);

		}
		@GetMapping("find-one/{id}")
		public ResponseEntity<Employee>findone(@PathVariable int id){
		Employee employee =employeService.findone(id);
		return new ResponseEntity<>(employee,HttpStatus.CREATED);
		}


		
		
	}

