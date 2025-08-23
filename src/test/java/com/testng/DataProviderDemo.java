package com.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	
	@Test(dataProvider = "usernameDetails")
	public void userDetails(Object username) {
		System.out.println("Username: "+ username);
		//System.out.println("Password: "+ password);
	}
	
	@DataProvider(name="userDetails")
	public Object[][] getData(){
		return new Object[][] {
			{"Dony","dony123"},
			{"Kalpana", "abcdef"},
			{"Pooja", "ghijkl"}
		};
	}
	
	@DataProvider(name="usernameDetails")
	public Object[] getuserData(){
		Object a[] = {"Dony","Kalpana","Pooja",123456, true, 10.45f, 1234567890l, 11.5, 'A'};
		return a;
	}

}
