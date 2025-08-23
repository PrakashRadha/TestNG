package com.testng;

import org.testng.annotations.Test;

public class GroupingDemo {
	
	@Test(groups = "Smoke")
	public void sayHi() {
		System.out.println("Hi");
	}

	@Test(groups = {"Functional"})
	public void sayHello() {
		System.out.println("Hello");
	}
	
	@Test(groups = {"Smoke", "Regression"})
	public void sayWelcome() {
		System.out.println("Welcome");
	}
	
	@Test(groups = "Regression")
	public void sayThanks() {
		System.out.println("Thanks");
	}
	
	@Test(groups= "Smoke")
	public void greet() {
		System.out.println("Hi, How are you?");
	}
}
