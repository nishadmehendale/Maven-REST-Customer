package com.demo.rest.hello;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.demo.customer.pojo.Customer;
import com.demo.rest.hello.customer.ServiceImpl;
import com.demo.rest.hello.exception.InvalidCustomerNameException;


@RestController

public class Hello{
	@Autowired
	private ServiceImpl service /*= new ServiceImpl()*/; 
	
	@ResponseStatus(value=HttpStatus.OK)
	@RequestMapping(value="/customer/create/{id},{name}"/*, method=RequestMethod.POST consumes="application/json"*/)
	public String create(@PathVariable int id,@PathVariable String name) {
		
		//@RequestBody Customer customer
		Customer customer = new Customer(name,id);
	//	System.out.println(customer+"jakdasjkdna ");
		service.create(customer);
		return "Created";
	}
	
	@RequestMapping(value="/customers/view", method=RequestMethod.GET/*,produces=MediaType.ALL_VALUE*/)
	public Collection<Customer> viewAll() {
		System.out.println(service);
		return service.viewAllCustomers();
	}
	
	@RequestMapping(value="/customers/view/{id}", method=RequestMethod.GET)
	public Resource<Customer> view(@PathVariable int id) throws InvalidCustomerNameException, Exception {
////		Customer customer = service.viewCustomer(id).;
////		customer.add(linkTo(methodOn(Hello.class).updateCustomer(customer)));
		
			
			return new Resource<Customer>(service.viewCustomer(id));
//			throw new InvalidCustomerNameException("Customer name is null!!");
	
//			
		
		}
	
//	@ExceptionHandler(InvalidCustomerNameException.class)
//	public ResponseEntity<ErrorResponse> exceptionHandler(Exception ex) {
//		ErrorResponse error = new ErrorResponse();
//		
//	}
	
	@RequestMapping(value="/customer/update", method=RequestMethod.PUT, consumes="application/json")
	public void updateCustomer(@RequestBody Customer customer){
		service.updateCustomer(customer);
	}
	
	@RequestMapping(value="/customer/{id}", method=RequestMethod.DELETE)
	public void deleteCustomer(@PathVariable int id) {
		service.deleteCustomer(id);
	}
}
