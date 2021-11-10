package com.revature.services;

import com.revature.repositories.SodaDao;
import com.revature.repositories.SodaPostgres;

public class SodaServices {
	
	public static SodaDao sd = new SodaPostgres();

}
