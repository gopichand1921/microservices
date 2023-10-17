package com.microservices.pojo;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.websocket.server.PathParam;

@FeignClient(name="data" ,url="https://jsonplaceholder.typicode.com")
public interface FeignCleintApi {
	@GetMapping("/albums")
	public List<EmployeeEntity>albums();
	@GetMapping("/albums/{id}")
	EmployeeEntity employeeEntity(@PathVariable int id);
	@GetMapping("/comments")
	public List<Comments> comments(@RequestParam int id );
	@GetMapping("/comments")
	public List<Comments> comments();
		
	

}
