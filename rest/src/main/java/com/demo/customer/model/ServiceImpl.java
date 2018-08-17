package com.demo.customer.model;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.demo.customer.pojo.Customer;

@Component
public class ServiceImpl{
	@Autowired
	DAOImpl dao/* = new DAOImpl()*/;
	
	/* (non-Javadoc)
	 * @see com.demo.customer.model.Service#create(java.lang.String)
	 */
	
	public void create(String name) {
		dao.create(name);
	}
	
	/* (non-Javadoc)
	 * @see com.demo.customer.model.Service#viewAllCustomers()
	 */
	
	public ArrayList<Customer> viewAllCustomers() {
		return dao.viewAllCustomers();
		
	}
	
	public void updateCustomer(int customerID, String name) {
		dao.updateCustomer(customerID, name);
	}
}
