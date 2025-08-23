package com.testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterDemo {
	
	@Test
	@Parameters({"username","password"})
	public void userDetails(String username, String password) {
		System.out.println("Username: "+ username);
		System.out.println("Password: "+ password);
	}

}
