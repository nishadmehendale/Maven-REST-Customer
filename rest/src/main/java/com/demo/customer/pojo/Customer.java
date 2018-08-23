package com.demo.customer.pojo;

import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.hateoas.ResourceSupport;

@XmlRootElement
public class Customer extends ResourceSupport{
	private String name;
	private int customerId;
	
	
	
	public Customer(String name, int customerId) {
		super();
		this.name = name;
		this.customerId = customerId;
	}

	public Customer() {
		
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", customerId=" + customerId + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCustomerId() {
		return customerId;
	}
	
	
}
