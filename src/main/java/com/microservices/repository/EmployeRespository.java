package com.microservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.microservices.entity.Employee;

import java.util.List;

@EnableJpaRepositories("com.microservices.entity.Employee.Class")
public interface EmployeRespository extends JpaRepository<Employee, Integer> {


}
