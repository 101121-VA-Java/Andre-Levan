package com.revature.controllers;

import com.revature.util.ConnectionUtil;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import javax.security.auth.login.LoginException;

import com.revature.controllers.LoginController;
import com.revature.repositories.SodaPostgres;


public class FrontEndController {
	
	private static Scanner sc;
	private EmployeeController ec;
	private CustomerController cc;
	
	public FrontEndController() {
		sc = new Scanner(System.in);
		ec = new EmployeeController();
	}
	
	public static void start() throws LoginException {
		boolean start = true;
		
		while(start) {
			System.out.println("Hello! Welcome to Sully's Soda Shoppe!");
			System.out.println("Please select an option from the following:");
			System.out.println("1: Register a new account");
			System.out.println("2: Login to your existing account");
			System.out.println("3: Browse inventory as guest");
			System.out.println("4: Exit");
			
			String selection = sc.nextLine();
			
			switch(selection) {
			
			case "1": 
				System.out.println("Please select an option:");
				System.out.println("1: Register a new Customer");
				System.out.println("2: Register a new Employee (Must have Manager credentials)");
				System.out.println("3: Return to main menu");
		
				String uoe = sc.nextLine();
				switch(uoe) {
				
				//this is inside Register a new account switch
				case "1":
					System.out.println("Entering new Customer Registration...");
					CustomerController rc = new CustomerController();
					rc.registerCustomer(sc);
					break;	
				case "2":
					System.out.println("NOTE: Only managers may register new employees.");
					System.out.println("Entering new Employee Registration...");
					EmployeeController re = new EmployeeController();
					try {
						re.registerEmployee(sc);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					break;
				case "3":
					System.out.println("Returning to main menu...");
					FrontEndController foe = new FrontEndController();
					foe.start();
					break;
			    default:
					System.out.println("Sorry, please enter either 1, 2 or 3.");
					System.out.println("Returning to main menu...");
					FrontEndController foe1 = new FrontEndController();
					foe1.start();
					break;
				}sc.close();
				break;
				
			case "2":
				System.out.println("Entering login menu...");
				LoginController login = new LoginController();
				login.login(sc);
				
				//Scan for username
				//System.out.println("Enter your password");
				//refer to request for login credentials
				break;
				
			case "3":
				System.out.println("Notice: You can only browse inventory here, please login as a user to place an order");
				SodaPostgres soa = new SodaPostgres();
				soa.getAllSoda();
				break;
				
			case "4":
				System.out.println("Go outside and get some fresh air!");
				System.out.println("Returning to main menu...");
				FrontEndController foe = new FrontEndController();
				foe.start();
				break;
				
			default:
				System.out.println("Please enter either 1,2,3 or 4.");
				System.out.println("Returning to main menu...");
				FrontEndController foe2 = new FrontEndController();
				foe2.start();
			}
			break;
		}
		sc.close();
	}

}
