package com.springrest.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer implements Serializable {
	/**
	 * 
	 */
	// private static final long serialVersionUID = 1L;

	private Integer id;
	private String firstName;
	private String lastName;
	private Status status;


	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(String firstName, String lastName, Status status) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.status = status;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name="first_name")
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column(name="last_name")
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Enumerated(EnumType.STRING)
	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
	

	public enum Status {
		ACTIVE, INACTIVE
	}

}
