package com.revature.repositories;

import com.revature.models.Soda;

public interface SodaDao extends GenericDao<Soda>{
	Soda[] getAllCustomers();
	Soda getSodabyName(String name);
	Soda addCustomer(Soda s);
	boolean editCustomer(Soda s);
	boolean deleteCustomer(int id);

}