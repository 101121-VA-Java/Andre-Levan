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
		
		try(Connection con = ConnectionUtil.getConnectionFromFile()){
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				int c_id = rs.getInt("c_id");
				String c_first_name = rs.getString("c_first_name");
				String c_last_name = rs.getString("c_last_name");
				String c_username = rs.getString("c_username");
				String c_password = rs.getString("c_password");
				Boolean hasActiveOrder = rs.getBoolean("c_hasActiveOrder");


				cus = new Customer(c_id, c_first_name, c_last_name, c_username, c_password, hasActiveOrder);
			}
		} 
		catch (SQLException | IOException e) {
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
		
		try (Connection con = ConnectionUtil.getConnectionFromFile()){
			Statement s = con.createStatement();
			ResultSet rs = s.executeQuery(sql);
			
			while(rs.next()) {
				int id = rs.getInt("c_id");
				String firstName = rs.getString("c_first_name");
				String lastName = rs.getString("c_last_name");
				String username = rs.getString("c_username");
				String password = rs.getString("c_password");
				Boolean hasActiveOrder = rs.getBoolean("c_hasActiveOrder");
				
				Customer newCus = new Customer(id, firstName, lastName, username, password, hasActiveOrder);
				customers.add(newCus);
			}
		}
		catch (SQLException | IOException e) {
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
	public int addCustomer(Customer c) {
		
		return 0;
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