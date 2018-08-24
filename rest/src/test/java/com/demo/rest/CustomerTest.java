package com.demo.rest;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.demo.rest.hello.Hello;
import com.demo.rest.hello.customer.DAOImpl;
import com.demo.rest.hello.customer.ServiceImpl;

@SpringBootTest
@RunWith(SpringRunner.class)
//@WebMvcTest(value= Hello.class, secure=false)s
public class CustomerTest {
	
//	@Autowired
	private MockMvc mockMvc;
	
	
	@InjectMocks
	private Hello hello;
	
	@Before
	public void setUp() throws Exception{
		mockMvc = MockMvcBuilders.standaloneSetup(hello).build();
	}
//	
	@Mock
	private ServiceImpl service;
	@Mock
	private DAOImpl dao;
//	
	@Test
	public void testViewCustomer() throws Exception {
		
		mockMvc.perform(get("/customers/view")).andExpect(status().isOk()).andExpect(content().string("[]"));
//		verify(service.viewAllCustomers());
	}
	
	@Test
	public void testViewACustomer() throws Exception {
		mockMvc.perform(get("/customers/view/101")).andExpect(status().isNotFound());
	}

}
