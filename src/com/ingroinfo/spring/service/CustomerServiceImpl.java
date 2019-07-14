package com.ingroinfo.spring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ingroinfo.spring.dao.CustomerDAO;
import com.ingroinfo.spring.entity.Customer;


@Service
public class CustomerServiceImpl implements CustomerService {
	

	@Autowired
	private CustomerDAO customerDAO;
    @Transactional
    @Override
	public List<Customer> getCustomers() {
		// TODO Auto-generated method stub
		return customerDAO.getCustomers();
	}
	@Override
	@Transactional
	public void saveCustomers(Customer theCustomer) {
		
		 customerDAO.saveCustomer(theCustomer);
		
	}
	@Override
	@Transactional
	public Customer getCustomers(int theId) {
		
		return customerDAO.getCustomer(theId);
	}
	@Override
	@Transactional
	public void deleteCustomers(int theId) {
		
		 customerDAO.deleteCustomer(theId);
			
	}
	

	
	}


