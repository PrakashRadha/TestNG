package com.testng;

import org.testng.annotations.Test;

public class InvoCationAndTimeout {
	
	@Test(invocationCount = 3, timeOut = 1500)
	public void invocation() throws InterruptedException {
	
		System.out.println("Hello In Invocation");
	}

}
