package com.revature.models;

public class Customer {
	//Customer Traits
	private int id;
	private String name;
	private String username;
	private String password;
	private double cardnumber; //for payment processing
	private boolean hasActiveOrder; //For managers and employees to see who has orders placed.
	
	public Customer() {
		super();
	}
	
	public Customer(String name, String username, String password) {
		super();
		this.name = name;
		this.username = username;
		this.password = password;
	}
	
	public Customer(int id, String name, String username, String password, double cardnumber, boolean hasActiveOrder) {
		super();
		this.id = id;
		this.name = name;
		this.username = username;
		this.password = password;
		this.cardnumber = cardnumber;
		this.hasActiveOrder = hasActiveOrder;
		
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public double getCardnumber() {
		return cardnumber;
	}

	public void setCardnumber(double cardnumber) {
		this.cardnumber = cardnumber;
	}
	
	public boolean isHasActiveOrder() {
		return hasActiveOrder;
	}

	public void setHasActiveOrder(boolean hasActiveOrder) {
		this.hasActiveOrder = hasActiveOrder;
	}

}