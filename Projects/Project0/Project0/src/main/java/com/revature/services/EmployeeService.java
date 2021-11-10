package com.revature.services;

import com.revature.repositories.EmployeeDao;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import com.revature.controllers.EmployeeController;
import com.revature.services.EmployeeService;

import javax.security.auth.login.LoginException;

import com.revature.controllers.FrontEndController;
import com.revature.models.Customer;
import com.revature.models.Employee;
//import com.revature.repositories.EmployeeArray;
import com.revature.repositories.EmployeeDao;
import com.revature.repositories.EmployeePostgres;

//import userNotFoundException?

public class EmployeeService {
	
	public static EmployeeDao ed = new EmployeePostgres();
	
	public Employee getEmployeeByUsername(String username) {
		List<Employee> employees = ed.getAll();
		for(Employee e : employees) {
			if(e.getUsername().equals(username)) {
				return e;
			}
		}
		return null;
	}
    
	public Employee login(String username, String password) throws LoginException{
		Employee emp = this.getEmployeeByUsername(username);
		if(emp == null || !emp.getPassword().equals(password)) {
			throw new LoginException();
		}
		ed.update(emp);
		return emp;
	}
	
	public void eMenu() {
		Scanner sc;
		sc = new Scanner(System.in);
		System.out.println("Welcome valued Employee!");
		System.out.println("Please select and option:");
		System.out.println("1: Manage Shop");
		System.out.println("2: View Payments");
		System.out.println("3: Return to main menu");
		
		String choice = sc.nextLine();
		
		switch(choice) {
		
		case "1":
			System.out.println("Entering Shop menu...");
			//refer to shop menu method
			break;
		case "2":
			System.out.println("Payments:");
			break;
		case "3":
			System.out.println("Returning to main menu...");
			FrontEndController foe = new FrontEndController();
			try {
				foe.start();
			} catch (LoginException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		default:
			System.out.println("Sorry, please enter an option below");
		}
		
		sc.close();
	}
	
	public void mMenu() {
		Scanner sc;
		sc = new Scanner(System.in);
		
		System.out.println("Welcome valued Employee!");
		System.out.println("Please select and option:");
		System.out.println("1: Manage Shop");
		System.out.println("2: View Payments");
		System.out.println("3: Return to main menu");
		System.out.println("4: Create new Employee");
		System.out.println("5:");
		System.out.println("6:");
		System.out.println("7:");
		
        String choice = sc.nextLine();
		
		switch(choice) {
		case "1":
			System.out.println("Entering Shop menu...");
			//refer to shop menu method
			break;
		case "2":
			System.out.println("Payments:");
			break;
		case "3":
			System.out.println("Returning to main menu...");
			FrontEndController foe = new FrontEndController();
			try {
				foe.start();
			} catch (LoginException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case "4":
			EmployeeController emc = new EmployeeController();
			try {
				emc.registerEmployee(sc);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		default:
			System.out.println("Sorry, please enter an option below");
		}
		
		sc.close();
	}

}
