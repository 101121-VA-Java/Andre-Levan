package com.revature.services;

import java.util.List;

import com.revature.models.Soda;
import com.revature.repositories.SodaDao;
import com.revature.repositories.SodaPostgres;

public class SodaServices {
	
	public static SodaDao sd = new SodaPostgres();
	
	public static Soda addSoda(Soda s) {

		return sd.add(s);
	}

	public static List<Soda> getAll() {

		return sd.getAll();

	}
	public static boolean editBird(Soda b) {
		return sd.update(b);
	}
	public static Soda getByName(int name) {
		return sd.getSodaByName(name);
	}
	public static boolean delete(Soda s) {
		return sd.deleteSodaByName(s);
	}

}
