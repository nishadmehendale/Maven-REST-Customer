package com.demo.customer.model;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import com.demo.customer.pojo.Customer;

@Component
public class DAOImpl{
	
	private static ArrayList<Customer> customerList = new ArrayList<>();
	

	/* (non-Javadoc)
	 * @see com.demo.customer.model.DAO#create(java.lang.String)
	 */
	
	public void create(String name) {
		Customer customer = new Customer(name);
		addCustomer(customer);
		
	}

	private void addCustomer(Customer customer) {
		customerList.add(customer);
		
	}
	

	/* (non-Javadoc)
	 * @see com.demo.customer.model.DAO#viewAllCustomers()
	 */
	
	public ArrayList<Customer> viewAllCustomers() {
		return customerList;
	}
	
	public void updateCustomer(int customerID, String name) {
		
		for(Customer a : customerList ) {
			if(a.getCustomerId() == customerID) {
				a.setName(name);
			}
		}
		
	}
	
}
