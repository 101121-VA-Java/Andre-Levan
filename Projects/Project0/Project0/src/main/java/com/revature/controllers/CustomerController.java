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
		System.out.println("Enter your name:");
		String name = scan.nextLine();
		System.out.println("Enter a username:");
		String username = scan.nextLine();
		System.out.println("Enter a password");
		String password = scan.nextLine();
		
		Customer newCustomer = new Customer(name, username, password);
	
		// TODO: check whether an employee created or not (if the method works)
		//		us.addEmployee(newEmployee);
				
			//	System.out.println("Employee has been registered");
	}

}