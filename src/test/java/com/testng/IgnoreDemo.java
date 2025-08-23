package com.testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class IgnoreDemo {

	@Test(priority = -2)
	public void openApplication() {
		System.out.println("Open the application");
	}
	
	@Test(priority = 0)
	public void loginWithCredentials() {
		System.out.println("User logged in the application with valid credentials");
	}
	

	@Test(priority = 1)
	public void loginWithCredentials2() {
		System.out.println("User logged in the application with valid credentials");
	}
	
	@Test(priority = 5)
	public void closeTheApp() {
		System.out.println("Closing the application");
	}
}
