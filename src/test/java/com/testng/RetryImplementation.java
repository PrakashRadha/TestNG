package com.testng;

import org.testng.annotations.Test;

public class RetryImplementation {
	
	@Test(retryAnalyzer = RetryDemo.class)
	public void getNum() {
		System.out.println("Num: "+10/0);
	}

}
