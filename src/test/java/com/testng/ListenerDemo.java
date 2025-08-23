package com.testng;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerDemo implements ITestListener{

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Automation Run Begins....");
	}
	
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test Starts");
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Passed");
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Failed");
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Skipped");
	}
	
	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Automation Run Ends");
	}
}
