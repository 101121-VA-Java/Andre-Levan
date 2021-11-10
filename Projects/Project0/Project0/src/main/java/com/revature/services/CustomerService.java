package com.revature.services;

import com.revature.repositories.CustomerDao;
import com.revature.services.SodaServices;
import java.util.List;
import java.util.Scanner;

import javax.security.auth.login.LoginException;

import com.revature.controllers.FrontEndController;
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
		Scanner sc;
		sc = new Scanner(System.in);
		System.out.println("Customer shop Menu, please select an option below:");
		System.out.println("1: View Store Inventory");
		System.out.println("2: Create Offer");
		System.out.println("3: Return to main menu");
		
		String cmc = sc.nextLine();
		switch(cmc) {
		case"1":
			System.out.println("Store Inventory");
			System.out.println(SodaServices.getAll());
			cMenu();
			break;
		case"2 Create Offer":
		    break;
		case"3":
			System.out.println("Returning to main menu...");
			FrontEndController foe = new FrontEndController();
			try {
				foe.start();
			} catch (LoginException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		}
	}
}
