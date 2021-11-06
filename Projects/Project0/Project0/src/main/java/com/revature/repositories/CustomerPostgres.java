package com.revature.repositories;

import java.util.List;

import com.revature.models.Customer;

public class CustomerPostgres implements CustomerDao{

	@Override
	public Customer add(Customer c) {
		
		//String sql = "insert into customers ("c_id, c_firstname, c_lastname, c_email
		return null;
	}

	@Override
	public Customer getByID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer remove(Customer c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> getAll() {
		// TODO Auto-generated method stub
		return null;
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

	@Override
	public int addCustomer(Customer c) {
		// TODO Auto-generated method stub
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