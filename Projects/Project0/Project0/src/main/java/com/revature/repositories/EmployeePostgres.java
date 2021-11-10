package com.revature.repositories;


import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import com.revature.models.Employee;
import com.revature.util.ConnectionUtil;

public class EmployeePostgres implements EmployeeDao{

	@Override
	public List<Employee> getAllEmployees() {
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

				Employee newEmp = new Employee(id, firstname, lastname, e_username, e_password, role, man_id, isManager);
				employees.add(newEmp);
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();	
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return employees;
	}

	@Override
	public Employee getEmployeeById(int id) {
		
		return null;
	}

	@Override
	public Employee addEmployee(Employee e) throws IOException {
		String STOCKER = "STOCKER";
		e.setRole(STOCKER);
		String sql = "insert into employees (e_firstname,e_lastname, e_username,e_password, e_role, man_e_id, isMan)"
				+ "values(?,?,?,?,?,?,?) returning e_id;";
		
		try(Connection con = ConnectionUtil.getConnectionFromFile()){
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setString(1,  e.getFirstname());
			ps.setString(2,  e.getLastname());
			ps.setString(3, e.getUsername());
			ps.setString(4, e.getPassword());
			ps.setString(5, e.getRole());
			ps.setInt(6, 5);
			ps.setBoolean(7, false);
			ResultSet rs = ps.executeQuery();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return e;
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
