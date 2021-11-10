package com.revature.repositories;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.models.Customer;
import com.revature.util.ConnectionUtil;

public class CustomerPostgres implements CustomerDao{

	//this same method is found below
	@Override
	public Customer add(Customer c) {
		
		//String sql = 
		 //             "insert into customers ("c_id, c_firstname, c_lastname, c_email
		return null;
	}

	@Override
	public Customer getByID(int id) {
		String sql =
				"select * from customers where c_id = ?";
		Customer cus = null;
		
		try(Connection con = ConnectionUtil.getConnectionFromEnv()){
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				int c_id = rs.getInt("c_id");
				String c_first_name = rs.getString("c_firstname");
				String c_last_name = rs.getString("c_lastname");
				String c_username = rs.getString("c_username");
				String c_password = rs.getString("c_password");
				Boolean hasActiveOrder = rs.getBoolean("c_hasActiveOrder");


				cus = new Customer(c_id, c_first_name, c_last_name, c_username, c_password, hasActiveOrder);
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		return cus;
	}

	
	@Override
	public Customer remove(Customer c) {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public List<Customer> getAll() {
		String sql =
				"select * from customers";
		List<Customer> customers = new ArrayList<>();
		
		try (Connection con = ConnectionUtil.getConnectionFromEnv()){
			Statement s = con.createStatement();
			ResultSet rs = s.executeQuery(sql);
			
			while(rs.next()) {
				int id = rs.getInt("c_id");
				String firstName = rs.getString("c_firstname");
				String lastName = rs.getString("c_lastname");
				String username = rs.getString("c_username");
				String password = rs.getString("c_password");
				Boolean hasActiveOrder = rs.getBoolean("c_hasActiveOrder");
				
				Customer newCus = new Customer(id, firstName, lastName, username, password, hasActiveOrder);
				customers.add(newCus);
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return customers;
	}

	
	@Override
	public boolean update(Customer t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Customer[] getAllCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer getCustomerbyId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	//next add
	@Override
	public Customer addCustomer(Customer c) {
		String sql = "insert into customers (c_firstname,c_lastname, c_username,c_password, c_hasActiveOrder)"
				+ "values(?,?,?,?,?) returning c_id;";
		
		try(Connection con = ConnectionUtil.getConnectionFromEnv()){
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setString(1,  c.getFirstname());
			ps.setString(2,  c.getLastname());
			ps.setString(3, c.getUsername());
			ps.setString(4, c.getPassword());
			ps.setBoolean(5, false);
			ResultSet rs = ps.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return c;
	}

	@Override
	public boolean editCustomer(Customer c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteCustomer(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}