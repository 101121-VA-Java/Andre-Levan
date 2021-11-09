package com.revature.driver;

import javax.security.auth.login.LoginException;

import com.revature.controllers.FrontEndController;

public class Driver {
	
	public static void main(String[] args) throws LoginException {
		FrontEndController fec = new FrontEndController();
		fec.start();
	}

}
