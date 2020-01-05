package com.training.MySpringApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.MySpringApp.model.Customer;
import com.training.MySpringApp.services.CustomerService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@GetMapping("customers")
	@ApiOperation(httpMethod="GET", value = "Get all customers", response=Customer.class, responseContainer="List")
	@ApiResponses(value = { 
			@ApiResponse(code = 200, message = "success", response=Customer.class, responseContainer="List"), 
			@ApiResponse(code = 400, message = "not found"), 
			@ApiResponse(code = 500, message = "internal error") 
	})
	public ResponseEntity<List<Customer>> getCustomers() {

		List<Customer> customerResponse = customerService.getAllCustomers();
		return ResponseEntity.ok(customerResponse);

	}

}
