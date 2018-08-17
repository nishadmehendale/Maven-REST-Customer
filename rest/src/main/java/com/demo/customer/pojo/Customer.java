package com.demo.customer.pojo;

public class Customer {
	private String name;
	private final int customerId;
	private static int custId;
	
	static {
		custId = 200;
	}
	
	{
		this.customerId = ++custId;
	}

	public Customer(String name) {
		this.name = name;
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
