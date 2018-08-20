package com.demo.customer.model;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.demo.customer.pojo.Customer;

public class DAOImpl{
	
	private Map<Integer,Customer> customerMap = new HashMap<>();
	

	/* (non-Javadoc)
	 * @see com.demo.customer.model.DAO#create(java.lang.String)
	 */
	
	public void create(Customer customer) {
		addCustomer(customer);
		
	}

	private void addCustomer(Customer customer) {
		customerMap.put(customer.getCustomerId(),customer);
		
	}
	


	/* (non-Javadoc)
	 * @see com.demo.customer.model.DAO#viewAllCustomers()
	 */
	
	public Collection<Customer> viewAllCustomers() {
		return customerMap.values();
	}
	
	public void updateCustomer(Customer customer) {
		
	}
		
	public void deleteCustomer(int customerId) {
//		Customer c = searchCustomer(name);
//		System.out.println(c+"In delete");
//		customerList.remove(c);
//		for(Customer a : customerList ) {
//			if(a.getCustomerId() == customerId) {
//				System.out.println(a);
//				customerList.remove(a);
//				break;
//			}
//	}
	}
	
	
}
