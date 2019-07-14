package com.ingroinfo.spring.service;

import java.util.List;

import com.ingroinfo.spring.entity.Customer;

public interface CustomerService {

	public List<Customer> getCustomers();
	
	public void saveCustomers(Customer theCustomer);

	public Customer getCustomers(int theId);

	public void deleteCustomers(int theId);
	
}
