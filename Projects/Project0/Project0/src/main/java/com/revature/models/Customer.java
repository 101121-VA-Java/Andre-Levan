package com.revature.models;

public class Customer {
	//Customer Traits
	private int id;
	private String firstname;
	private String lastname;
	private String username;
	private String password;
	private boolean hasActiveOrder; //For managers and employees to see who has orders placed.
	
	public Customer() {
		super();
	}
	
	public Customer(String name, String username, String password, String firstname, String lastname) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.username = username;
		this.password = password;
	}
	
	public Customer(int id, String firstname, String lastname, String username, String password, boolean hasActiveOrder) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.username = username;
		this.password = password;
		this.hasActiveOrder = hasActiveOrder;
		
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isHasActiveOrder() {
		return hasActiveOrder;
	}

	public void setHasActiveOrder(boolean hasActiveOrder) {
		this.hasActiveOrder = hasActiveOrder;
	}

}