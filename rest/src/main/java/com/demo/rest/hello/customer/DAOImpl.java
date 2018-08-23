package com.demo.rest.hello.customer;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.demo.customer.pojo.Customer;
import com.demo.rest.hello.exception.InvalidCustomerNameException;

@Repository
public class DAOImpl{
	
	private Map<Integer,Customer> customerMap = new HashMap<>();
	
	public void create(Customer customer) {
		addCustomer(customer);
		
	}

	private void addCustomer(Customer customer) {
		customerMap.put(customer.getCustomerId(),customer);
		
	}
	
	public Collection<Customer> viewAllCustomers() {
		return customerMap.values();
	}
	
	public void updateCustomer(Customer customer) {
		customerMap.replace(customer.getCustomerId(), customer);
	}
		
	public void deleteCustomer(int customerId) {
		customerMap.remove(customerId);
	}

	public Customer viewCustomer(int id) throws InvalidCustomerNameException, Exception {
		if(customerMap.get(id) == null)
			throw new InvalidCustomerNameException();
		else
			return customerMap.get(id);
	}
	
	
}
