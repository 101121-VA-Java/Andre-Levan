package com.revature.models;

import java.util.Objects;

public class Employee {
	//Employee traits
	private int id; //id assigned will be assigned by system
	private String firstname;
	private String lastname;
	private String username;
	private String password;
	private String role; 
	private int managerid;
	private Boolean isManager; //using to easily check who is a manager and who isn't
	
	
	public Employee(int id) {
		super();
		this.id = id;
	}
		
	public Employee(){
		super();
	} 
	
	public Employee(String firstname, String lastname, String username, String password) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.username = username;
		this.password = password;
	}
	
	public Employee(int id, String firstname, String lastname, String username, String password, String role, int managerid, Boolean isManager) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.username = username;
		this.password = password;
		this.role = role;
		this.managerid = managerid;
		this.isManager = isManager;
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
	
	public String getRole() { 
		return role;
	}
	
	public void setRole(String role) {
		this.role = role;
	}
	
	public int getManagerid() {
		return managerid;
	}

	public void setManagerid(int managerid) {
		this.managerid = managerid;
	}

	public Boolean getIsManager() {
		return isManager;
	}

	public void setIsManager(Boolean isManager) {
		this.isManager = isManager;
	}
	
    //FUTURE: ADD TESTING LOGIC below
	

	@Override
	public int hashCode() {
		return Objects.hash(firstname, id, isManager, lastname, managerid, password, role, username);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(firstname, other.firstname) && id == other.id
				&& Objects.equals(isManager, other.isManager) && Objects.equals(lastname, other.lastname)
				&& managerid == other.managerid && Objects.equals(password, other.password)
				&& Objects.equals(role, other.role) && Objects.equals(username, other.username);
	}
}
