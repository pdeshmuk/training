package com.training.MySpringApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
public class MySpringAppController {
	
	@GetMapping("customers")
	@ApiOperation(httpMethod="Get", value = "Get all customers", response=String.class)
	@ApiResponses(value = { 
			@ApiResponse(code = 200, message = "success"), 
			@ApiResponse(code = 400, message = "not found"), 
			@ApiResponse(code = 500, message = "internal error") 
	})
	public String getCustomers() {
		return "prabodh deshmukh, cosmin deshmukh";
	}

}
