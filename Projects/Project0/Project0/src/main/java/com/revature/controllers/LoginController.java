package com.revature.controllers;

import java.util.Scanner;

import javax.security.auth.login.LoginException;

import com.revature.services.CustomerService;
import com.revature.services.EmployeeService;

public class LoginController {
	public static Scanner sc;
	private static CustomerService cs = new CustomerService();
	private static EmployeeService es = new EmployeeService();		
			
	public static void login(Scanner scan) throws LoginException {
		sc = new Scanner(System.in);
		System.out.println("Login Controller menu");
		System.out.println("Select an option below");
		System.out.println("1: Customer");
		System.out.println("2: Employee");
		System.out.println("3: Return to Main Menu");
		
		String coe = sc.nextLine();
		switch(coe) {
		case "1":
			loginCustomer(scan);
			System.out.println("You are now logged in, welcome!");
		    break;
		
		case "2":
			loginEmployee(scan);
			System.out.println("You are now logged in, welcome!");
	        break;
	     
		case "3":
			System.out.println("Returning to main menu...");
			FrontEndController foe = new FrontEndController();
			foe.start();
			break;
		default:
			System.out.println("Sorry, please enter either 1, 2 or 3.");
			System.out.println("Returning to main menu...");
			LoginController.login(scan);
			break;
		}
		sc.close();
	}
	
	public static void loginCustomer(Scanner scan) throws LoginException {
		System.out.println("Enter your username:");
		String username = scan.nextLine();

		System.out.println("Enter your password");
		String password = scan.nextLine();
		cs.login(username, password);
		
	}
	
	public static void loginEmployee(Scanner scan) throws LoginException {
		System.out.println("Enter a username:");
		String username = scan.nextLine();

		System.out.println("Enter a password");
		String password = scan.nextLine();
	    es.login(username,password);
	}
}
