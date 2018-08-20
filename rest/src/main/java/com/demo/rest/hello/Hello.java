package com.demo.rest.hello;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.customer.model.ServiceImpl;
import com.demo.customer.pojo.Customer;


@RestController

public class Hello{
	
	ServiceImpl service; 
	
	@RequestMapping(value="/customer/create", method=RequestMethod.POST, consumes="application/json")
	public void create(@RequestBody Customer customer) {
		service.create(customer);
	}
	
//	@RequestMapping(value="/customers/view", method=RequestMethod.GET)
//	public ArrayList<Customer> viewAll() {
//		return service.viewAllCustomers();
//	}
	
	@RequestMapping(value="/customer/update", method=RequestMethod.PUT, consumes="application/json")
	public void updateCustomer(@RequestBody Customer customer) {
		service.updateCustomer(customer);
	}
	
	@RequestMapping(value="/customer/delete", method=RequestMethod.DELETE)
	public void deleteCustomer(int customerId) {
		service.deleteCustomer(customerId);
	}
}
