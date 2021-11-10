package com.revature.repositories;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import com.revature.models.Employee;
import com.revature.util.ConnectionUtil;

//public class EmployeePostgres implements EmployeeDao{

	@Override
	/*public Employee[] getAllEmployees() {
		String sql = "select * from employees";
		List<Employee> employees = new ArrayList<>();
		
		try(Connection con = ConnectionUtil.getConnectionFromFile()){
			Statement s = con.createStatement();
			ResultSet rs = s.executeQuery(sql);
			
			while (rs.next()) {
				int id = rs.getInt("e_id");
				String firstname = rs.getString("e_firstname");
				String lastname = rs.getString("e_lastname");
				String e_username = rs.getString("e_username");
				String e_password = rs.getString("e_password");
				String role = rs.getString("e_role");
				int man_id = rs.getInt("man_e_id");
				Boolean isManager = rs.getBoolean("isman");

				Employee newEmp = new Employee(id, firstname, lastname, e_username, e_password, role, new Employee(man_id), isManager);
				employees.add(newEmp);
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();	
		}
		return employees;
	*/}

	@Override
	public Employee getEmployeeById(int id) {
		
		return null;
	}

	@Override
	public int addEmployee(Employee e) {
		// TODO Auto-generated method stub
		return 0;
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
