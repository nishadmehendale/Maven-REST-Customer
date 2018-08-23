package com.demo.rest.hello.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
@SuppressWarnings("serial")
@ResponseStatus(value=HttpStatus.NOT_FOUND , reason=" Cust not found ")
public class InvalidCustomerNameException extends Exception {
	
//	public InvalidCustomerNameException(String message) throws Exception {
//		throw new Exception(message);
//	}

}
