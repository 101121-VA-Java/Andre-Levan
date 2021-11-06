package com.revature.controllers;

import java.util.Scanner;

public class LoginController {
	public static Scanner sc;
	public static void login(Scanner scan) {
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
		    break;
		
		case "2":
			loginEmployee(scan);
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
	public static void loginCustomer(Scanner scan) {
		System.out.println("Enter a username:");
		String username = scan.nextLine();

		System.out.println("Enter a password");
		String password = scan.nextLine();
	}
	
	public static void loginEmployee(Scanner scan) {
		System.out.println("Enter a username:");
		String username = scan.nextLine();

		System.out.println("Enter a password");
		String password = scan.nextLine();
	}
}
