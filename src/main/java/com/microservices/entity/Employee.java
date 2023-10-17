package com.microservices.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity(name="employee_table")
@Table(name="employee_table")
@Data
public class Employee {
	@Id
	@GeneratedValue
	int id;
	String name;
	String email;
	

}
