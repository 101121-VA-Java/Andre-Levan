package com.revature.repositories;

import java.io.IOException;
import java.util.List;

import com.revature.models.Employee;

public interface EmployeeDao extends GenericDao<Employee>{
	List<Employee> getAllEmployees(); // returns an array of all of the employees available
	Employee getEmployeeById(int id);
	Employee addEmployee(Employee e) throws IOException; // returns assigned id
	boolean editEmployee(Employee e);  
	boolean deleteEmployee(int id);  
}
