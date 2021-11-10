package com.revature.controllers;

import java.io.IOException;
import java.util.Scanner;

import javax.security.auth.login.LoginException;

import com.revature.models.Employee;
import com.revature.services.EmployeeService;

public class EmployeeController {
	
	public static EmployeeService us = new EmployeeService();
	
	public void searchForEmployee() {
		//scanner getting user input
		
	}
	
	//Registering new employees
	public void registerEmployee(Scanner scan) throws IOException {
		//manager login
		System.out.println("Enter your first name:");
		String firstname = scan.nextLine();
		System.out.println("Enter your last name:");
		String lastname = scan.nextLine();
		System.out.println("Enter a username:");
		String username = scan.nextLine();
		System.out.println("Enter a password");
		String password = scan.nextLine();
		Employee newemp = new Employee(firstname, lastname, username, password);
		us.ed.addEmployee(newemp);
		try {
			System.out.println("Employee Added! Returning to main menu...");
			FrontEndController.start();
		} catch (LoginException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
