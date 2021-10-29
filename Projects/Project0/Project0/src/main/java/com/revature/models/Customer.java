package com.revature.models;

public class Customer {
	//Customer Traits
	private int id;
	private String name;
	private String username;
	private String password;
	private double cardnumber; //for payment processing
	
	/*public Customer() {
		super();
	} not sure what this does
	*/ 
	
	public Customer(String name, String username, String password) {
		super();
		this.name = name;
		this.username = username;
		this.password = password;
	}
	
	public Customer(int id, String name, String username, String password, double cardnumber) {
		super();
		this.id = id;
		this.name = name;
		this.username = username;
		this.password = password;
		this.cardnumber = cardnumber;
		
	}
}