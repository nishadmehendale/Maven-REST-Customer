package com.demo.customer.model;

import java.util.Collection;

import com.demo.customer.pojo.Customer;


public class ServiceImpl{
	
	DAOImpl dao = new DAOImpl();
	
	/* (non-Javadoc)
	 * @see com.demo.customer.model.Service#create(java.lang.String)
	 */
	
	public void create(Customer customer) {
		dao.create(customer);
	}
	
	/* (non-Javadoc)
	 * @see com.demo.customer.model.Service#viewAllCustomers()
	 */
	
	public Collection<Customer> viewAllCustomers() {
		return dao.viewAllCustomers();
		
	}
	
	public void updateCustomer(Customer customer) {
		dao.updateCustomer(customer);
	}
	
	public void deleteCustomer(int customerId) {
		dao.deleteCustomer(customerId);
	}
}
