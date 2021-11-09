package com.revature.controllers;

import java.util.Scanner;

import com.revature.models.Customer;
import com.revature.services.CustomerService;

public class CustomerController {
	
	private CustomerService ca = new CustomerService();
	
	public void searchRegCustomer() {
		//scanner to get input
		//try {
			//Customer c = ca.getCustomerByName()
		//}
	}
	
	public void registerCustomer(Scanner scan) {
		System.out.println("Enter your first name:");
		String firstname = scan.nextLine();
		System.out.println("Enter your last name:");
		String lastname = scan.nextLine();
		System.out.println("Enter a username:");
		String username = scan.nextLine();
		System.out.println("Enter a password");
		String password = scan.nextLine();
		
		Customer newCustomer = new Customer(0, firstname, lastname, username, password, false);
	
		// TODO: check whether an employee created or not (if the method works)
		//		us.addEmployee(newEmployee);
				
			//	System.out.println("Employee has been registered");
	}

}
