package com.revature.controllers;

import java.util.Scanner;

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
			System.out.println("1: Register a new account");
			System.out.println("2: Login to your existing account");
			//add System.out.println("3: Browse  inventory as guest");
			System.out.println("4: Exit");
			
			String selection = sc.nextLine();
			
			switch(selection) {
			//Case 1 can only generate new users (Manager can register new employees through the manager menu)
			case "1": 
				//Scanner input needed here = new Scanner(System.in);
				String uoe = sc.nextLine();
				System.out.println("Please select an option:");
				System.out.println("1: Register a new User");
				System.out.println("2: Register a new Employee (Must have Manager credentials)");
		
				if(uoe == "1") {
					System.out.println("Entering new Customer Registration...");
					cc.registerCustomer(sc);
				}if(uoe == "2") {
					//ec.registerEmployee(sc);
					//Refer to manager login
					//then refer to manager employee registration.
				}else if(!(uoe.equals("1")
						|| uoe.equals("2"))){
					System.out.println("Error, please only enter 1 or 2");
					// add wait and take back to main menu?
				}
				//Add option for main menu return. Change else if.
				break;
			case "2":
				//refer to request for login credentials
				break;
			case "3":
				System.out.println("Notice: You can only browse inventory here, please login as a user to place an order");
				//refer to browsing inventory method
				break;
			case "4":
				System.out.println("Go outside and get some fresh air!");
				//Exit program?
				break;
			}
			break;
		}
		sc.close();
	}

}
