package com.revature.repositories;

import com.revature.models.Employee;
import com.revature.models.Role;

public class EmployeeArray implements EmployeeDao {
	
	private Employee[] employees = { new Employee(0, "Sully", "Sully", "SullyIsTheBest", Role.ADMIN, null, true) };
	
	public EmployeeArray() {
		super();
	}
	
	@Override
	public Employee[] getAllEmployees() {
		return this.employees;
	}
	
	@Override
	public Employee getEmployeeById(int id) { 
		return null;
	}

	@Override
	public int addEmployee(Employee e) {
		Employee[] holding = new Employee[employees.length +1];
		
		int i = 0;
		
		for(; i < employees.length; i++) {
			holding[i] = employees[i];
		}
		e.setId(i);
		
		holding[i] = e;
		
		employees = holding;
		
		return i;
	}

	@Override
	public boolean editEmployee(Employee e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteEmployee(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
