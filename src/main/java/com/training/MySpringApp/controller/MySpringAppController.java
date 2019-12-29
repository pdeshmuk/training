package com.training.MySpringApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MySpringAppController {
	
	@GetMapping("customers")
	public String getCustomers() {
		return "prabodh deshmukh, cosmin deshmukh";
	}

}
