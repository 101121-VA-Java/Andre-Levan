package com.revature.controllers;

import java.util.Scanner;
import com.revature.controllers.LoginController;


public class FrontEndController {
	
	private Scanner sc;
	private EmployeeController ec;
	private CustomerController cc;
	
	public FrontEndController() {
		sc = new Scanner(System.in);
		ec = new EmployeeController();
	}
	
	public void start() {
		boolean start = true;
		
		while(start) {
			System.out.println("Hello! Welcome to Sully's Soda Shoppe!");
			System.out.println("Please select an option from the following:");
			System.out.println("1: Register a new account(WIP)");
			System.out.println("2: Login to your existing account(WIP)");
			System.out.println("3: Browse inventory as guest(WIP)");
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
					re.registerEmployee(sc);
					//Refer to manager login
					//then refer to manager employee registration.
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
				//refer to browsing inventory method
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
