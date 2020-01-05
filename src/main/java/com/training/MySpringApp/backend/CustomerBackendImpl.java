package com.training.MySpringApp.backend;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.training.MySpringApp.model.Customer;
import com.training.MySpringApp.model.CustomerResponse;

@Component
public class CustomerBackendImpl implements CustomerBackend {

	@Override
	public List<Customer> getAllCustomers() {

		//TODO assume we are getting List<CustomerResponse> from the backend
		List<CustomerResponse> backendCustomerList = new ArrayList<CustomerResponse>();
		
		CustomerResponse customer1 = new CustomerResponse();
		customer1.setName("Prabodh Deshmukh");
		backendCustomerList.add(customer1);
		
		CustomerResponse customer2 = new CustomerResponse();
		customer2.setName("Cosmin Deshmukh");
		backendCustomerList.add(customer2);
		
		//map backend model to service model before returning
		return CustomerBackendMapper.populateCustomerResponse(backendCustomerList);
	}

}
