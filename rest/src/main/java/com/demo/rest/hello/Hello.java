package com.demo.rest.hello;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.customer.model.ServiceImpl;
import com.demo.customer.pojo.Customer;


@RestController
@Component
public class Hello{
	@Autowired
	ServiceImpl service;/*= new ServiceImpl()*/ 
	
	@RequestMapping(value="/customer/create", method=RequestMethod.POST)
	public void create(String name) {
		service.create(name);
	}
	
	@RequestMapping(value="/customers/view", method=RequestMethod.GET)
	public ArrayList<Customer> viewAll() {
		return service.viewAllCustomers();
	}
	
	@RequestMapping(value="/customer/update", method=RequestMethod.PUT)
	public void updateCustomer(int customerID, String name) {
		service.updateCustomer(customerID, name);
	}
}
