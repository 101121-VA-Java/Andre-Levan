package com.revature.services;

import com.revature.repositories.CustomerDao;
import java.util.List;
import javax.security.auth.login.LoginException;

import com.revature.models.Customer;
import com.revature.repositories.CustomerPostgres;

public class CustomerService {
	
	public static CustomerDao cd = new CustomerPostgres();
	
	public Customer getCustomerByUsername(String username) {
		List<Customer> customers = cd.getAll();
		for(Customer c : customers) {
			if(c.getUsername().equals(username)) {
				return c;
			}
		}
		return null;
	}
    
	public Customer login(String username, String password) throws LoginException{
		Customer cus = this.getCustomerByUsername(username);
		if(cus == null || !cus.getPassword().equals(password)) {
			throw new LoginException();
		}
		cd.update(cus);
		return cus;
	}
	
	public void cMenu() {
		System.out.println("Customer shop Menu, please select an option below:");
		
	}
}
