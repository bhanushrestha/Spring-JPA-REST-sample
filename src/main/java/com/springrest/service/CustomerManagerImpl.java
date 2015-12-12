package com.springrest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.api.CustomerManager;
import com.springrest.domain.Customer;
import com.springrest.repository.CustomerRespository;

@Service
public class CustomerManagerImpl implements CustomerManager {
	
	@Autowired
	private CustomerRespository customerRepository;

	@Override
	public Customer addNew(Customer t) {
		return this.customerRepository.save(t);
	}

	@Override
	public void addAll(List<Customer> list) {
		// TODO Auto-generated method stub

	}

	@Override
	public Customer update(Customer t) {
		return this.customerRepository.save(t);
	}

	@Override
	public void remove(Customer t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeBy(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Customer find(Integer id) {
		return this.customerRepository.findOne(id);
	}

	@Override
	public List<Customer> findAll() {
		return this.customerRepository.findAll();
	}

	@Override
	public List<Customer> findWithPaging(int page, int size) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long countRecord() {
		// TODO Auto-generated method stub
		return null;
	}

}
