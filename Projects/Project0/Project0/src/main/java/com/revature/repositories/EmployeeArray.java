package com.revature.repositories;

import java.util.List;

import com.revature.models.Employee;
import com.revature.models.Role;

public class EmployeeArray implements EmployeeDao {
	
	private Employee[] employees = { new Employee(0, "Admin", "LAdmin", "AUsername", "Apassword", Role.ADMIN, null, null) };
	
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

	@Override
	public Employee add(Employee t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee getByID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee remove(Employee t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(Employee t) {
		// TODO Auto-generated method stub
		return false;
	}

}
