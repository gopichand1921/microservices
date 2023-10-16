package com.microservices.feignclient;

import lombok.Data;

import java.io.Serializable;
import java.util.List;
@Data
public class EmployeeResponse implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -7720241511916545095L;
	private String status;
    private List<Employee> data;

    // Getters and setters

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Employee> getData() {
        return data;
    }

    public void setData(List<Employee> data) {
        this.data = data;
    }
}

