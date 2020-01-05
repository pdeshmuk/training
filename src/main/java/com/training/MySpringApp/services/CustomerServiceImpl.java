package com.training.MySpringApp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.MySpringApp.backend.CustomerBackend;
import com.training.MySpringApp.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerBackend customerBackend;
	
	@Override
	public List<Customer> getAllCustomers() {
		return customerBackend.getAllCustomers();
	}

}
