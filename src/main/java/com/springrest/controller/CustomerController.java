package com.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.api.CustomerManager;
import com.springrest.domain.Customer;

@RestController
@RequestMapping(value="/customer")
public class CustomerController {
	
	@Autowired
	private CustomerManager customerManager;

	@RequestMapping(method= RequestMethod.GET)
	public List<Customer> getCustomer(){
		return this.customerManager.findAll();
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public Customer addNewCustomer(@RequestBody Customer customer){
		return this.customerManager.addNew(customer);
	}
}
