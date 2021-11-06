package com.revature.services;

import com.revature.repositories.CustomerDao;
import com.revature.repositories.CustomerPostgres;

public class CustomerService {
	
	private static CustomerDao cd = new CustomerPostgres();

}
