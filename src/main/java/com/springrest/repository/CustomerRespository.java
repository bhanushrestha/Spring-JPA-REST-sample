package com.springrest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.domain.Customer;

public interface CustomerRespository extends JpaRepository<Customer, Integer>{

}
