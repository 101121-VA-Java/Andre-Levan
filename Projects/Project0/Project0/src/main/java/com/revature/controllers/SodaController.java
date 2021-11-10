package com.revature.controllers;

import java.util.Scanner;

import com.revature.models.Soda;
import com.revature.services.SodaServices;

public class SodaController {
	public static SodaServices us = new SodaServices();
	
	public void RegisterSoda(Scanner scan) {
		System.out.println("Enter the name:");
		String name = scan.nextLine();
		System.out.println("Enter the brand:");
		String brand = scan.nextLine();
		System.out.println("Enter the flavor:");
		String flavor = scan.nextLine();
		System.out.println("Enter the quantity");
		Integer quantity = scan.nextInt();
		System.out.println("Enter the price in USD");
		Integer price = scan.nextInt();
		Soda newsoda = new Soda(name, brand, flavor, quantity, price);
		us.sd.addSoda(newsoda);
		System.out.println("Soda added to the shelf! Returning to menu... ");
		
	}

}
