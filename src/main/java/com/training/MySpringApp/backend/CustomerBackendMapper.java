package com.training.MySpringApp.backend;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import com.training.MySpringApp.model.Customer;
import com.training.MySpringApp.model.CustomerResponse;

public class CustomerBackendMapper {
	
	private static String delimiter = " ";
	
	public static List<Customer> populateCustomerResponse(List<CustomerResponse> response) {
		
		List<Customer> customerList = new ArrayList<Customer>();
		
		//convert List<CustomerResponse> to List<Customer>
		for(CustomerResponse customerResponse: response) {
			StringTokenizer st = new StringTokenizer(customerResponse.getName(), delimiter);
			Customer customer = new Customer();
			customer.setFirstName(st.nextToken());
			customer.setLastName(st.nextToken());
			customerList.add(customer);
		}
		
		return customerList;
	}

}
