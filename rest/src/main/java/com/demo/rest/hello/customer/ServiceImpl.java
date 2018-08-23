package com.demo.rest.hello.customer;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.customer.pojo.Customer;
import com.demo.rest.hello.exception.InvalidCustomerNameException;

@Service
public class ServiceImpl{
	@Autowired
	DAOImpl dao/* = new DAOImpl()*/;
	
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

	public Customer viewCustomer(int id) throws InvalidCustomerNameException, Exception {
		return dao.viewCustomer(id);
	}
}
