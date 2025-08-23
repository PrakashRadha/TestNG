package com.testng;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class DependencyDemo {

	@Test
	public void sayHi() {
		System.out.println("Hi");
	}

	@Test
	public void sayHello() {
		System.out.println("Hello");
	}
	
	@Test(dependsOnMethods = "sayThanks")
	public void sayWelcome() {
		System.out.println("Welcome");
	}
	
	@Test()
	public void sayThanks() {
		System.out.println("Thanks");
		int a =10/0;
		System.out.println(a);
	}
	
	@Test
	public void greet() {
		System.out.println("Hi, How are you?");
	}

}
