package com.revature.controllers;

import java.util.Scanner;

//This controller contains only the shop menu, for the eMenu and mMenu please see EmployeeService. cMenu can be found in CustomerService
public class MenuController {
	public void Menu() {
		Scanner sc;
		sc = new Scanner(System.in);
		System.out.println("Shop Menu, please select an option below:");
		System.out.println("1: Add Soda to the shoppe");
		System.out.println("2: Delete Soda from the shoppe");
		System.out.println("3: Back to main menu");
		
		String selection = sc.nextLine();
		
		switch(selection) {
		case "1":
			System.out.println("Adding Soda to the shelf!");
			SodaController ns = new SodaController();
			ns.RegisterSoda(sc);
			break;
		case"2":
			System.out.println("Taking something down huh?");
		}
		
		
		
		
		
		sc.close();
	}

}
