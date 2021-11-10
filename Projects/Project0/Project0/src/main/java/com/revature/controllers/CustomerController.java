package com.revature.controllers;

import java.util.Scanner;

import javax.security.auth.login.LoginException;

import com.revature.models.Customer;
import com.revature.services.CustomerService;

public class CustomerController {
	
	private CustomerService ca = new CustomerService();
	
	public void searchRegCustomer() {
		//try {
			//Customer c = ca.getCustomerByName()
		//}
	}
	
	//Registering new Customer
	public void registerCustomer(Scanner scan) {
		System.out.println("Enter your first name:");
		String firstname = scan.nextLine();
		System.out.println("Enter your last name:");
		String lastname = scan.nextLine();
		System.out.println("Enter a username:");
		String username = scan.nextLine();
		System.out.println("Enter a password");
		String password = scan.nextLine();
		
		Customer newCustomer = new Customer(firstname, lastname, username, password, false);
        ca.cd.addCustomer(newCustomer);
        try {
        	System.out.println("Customer Added! Returning to main menu...");
			FrontEndController.start();
		} catch (LoginException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
