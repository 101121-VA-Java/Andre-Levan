package com.revature.controllers;

import com.revature.services.EmployeeService;
import java.util.Scanner;

public class EmployeeController {
	
	private EmployeeService us = new EmployeeService();
	
	public void searchForEmployee() {
		//scanner getting user input
		
	}
	
	public void registerEmployee(Scanner scan) {
		//Send to manager login first
		System.out.println("Enter your name:");
		String name = scan.nextLine();
		System.out.println("Enter a username:");
		String username = scan.nextLine();
		System.out.println("Enter a password");
		String password = scan.nextLine();
	}

}
