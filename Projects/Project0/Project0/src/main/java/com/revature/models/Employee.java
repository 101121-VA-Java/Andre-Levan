package com.revature.models;

public class Employee {
	//Employee traits
	private int id; //id assigned will be assigned by system
	private String name;
	private String username;
	private String password;
	private Role role; // using an enum to store a specific value
	private Employee manager;
	private Boolean isManager;
	
	public Employee(){
		super();
	} 
	
	public Employee(String name, String username, String password) {
		super();
		this.name = name;
		this.username = username;
		this.password = password;
	}
	
	public Employee(int id, String name, String username, String password, Role role, Employee manager, Boolean isManager) {
		super();
		this.id = id;
		this.name = name;
		this.username = username;
		this.password = password;
		this.role = role;
		this.manager = manager;
		this.isManager = isManager;
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
	
	public Role getRole() { 
		return role;
	}
	
	public void setRole(Role role) {
		this.role = role;
	}
	
	public Employee getManager() {
		return manager;
	}
	
	public void setManager(Employee manager) {
		this.manager = manager;
	}
	
	public Boolean getIsManager() {
		return isManager;
	}

	public void setIsManager(Boolean isManager) {
		this.isManager = isManager;
	}
    //FUTURE: ADD TESTING LOGIC below
}
