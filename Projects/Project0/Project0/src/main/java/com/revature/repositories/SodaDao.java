package com.revature.repositories;

import com.revature.models.Soda;

public interface SodaDao extends GenericDao<Soda>{
	Soda[] getAllSoda();
	Soda getSodabyName(String name);
	Soda addSoda(Soda s);
	boolean editCustomer(Soda s);
	boolean deleteCustomer(int id);

}