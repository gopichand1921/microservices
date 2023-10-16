package com.microservices.feignclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("feign-client-data")
public class Controller {
    @Autowired
    FeignClientRepo feignClientRepo;
@GetMapping("get-employee")
    public List<EmployeeResponse> getFeignClientRepo() {
        return feignClientRepo.employe();
    }
}
