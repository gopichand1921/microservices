package com.microservices.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "nameandi",url = "https://dummy.restapiexample.com/api/v1")
public interface FeignClientRepo {
    @GetMapping("/employees")
    public List<EmployeeResponse>employe();

}
