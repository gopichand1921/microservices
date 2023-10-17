package com.microservices.pojo;

import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("album")
public class AlbumsController {
	@Autowired
	FeignCleintApi api;
	@GetMapping("hello")
	public List<EmployeeEntity>employeeEntities(){
		return api.albums();
	}
	@GetMapping("hello/{id}")
	public EmployeeEntity employeeEntity(@PathVariable int id) {
		return api.employeeEntity(id);
	}
	@GetMapping("comments")
	public List<Comments> comments(@RequestParam int id){
		return api.comments(id);
	}
	@GetMapping("commentsdata")
	public List<Comments>commentsofdata(){
		return api.comments().stream().map(x->x).sorted(Comparator.comparing(Comments::getEmail)).toList().stream().distinct().limit(10).toList()
;
		
	}

}
