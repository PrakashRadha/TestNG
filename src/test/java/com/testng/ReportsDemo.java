package com.testng;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ReportsDemo implements ITestListener{

	public ExtentSparkReporter sparkReporter; // to setup the UI of the report
	public ExtentReports extent ; // to generate common data
	public ExtentTest tests; // to generate test related data
	
	@Override
	public void onStart(ITestContext context) {
		// create object for spark reporter
		sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir")+"/reports/automationReportOnStandard.html");
		sparkReporter.config().setDocumentTitle("Automation Report");
		sparkReporter.config().setReportName("Smoke Test Report");
		sparkReporter.config().setTheme(Theme.STANDARD);
		
		// Create Object for Extent reports to generate common data
		extent = new ExtentReports();
		extent.attachReporter(sparkReporter);
		extent.setSystemInfo("Browser", "Chrome");
		extent.setSystemInfo("Environment", "QA");
		extent.setSystemInfo("Tester", "Rekha");
	}
	
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Onstart : "+result.getName());
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		tests = extent.createTest(result.getName());
		tests.log(Status.PASS, "Test Case Passed : "+result.getName());
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		tests = extent.createTest(result.getName());
		tests.log(Status.FAIL, "Test Case Failed : "+result.getName());
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		tests = extent.createTest(result.getName());
		tests.log(Status.SKIP, "Test Case Skipped : "+result.getName());
	}
	
	@Override
	public void onFinish(ITestContext context) {
		extent.flush();
	}
	
	
	
	
	
	
	
	
	
}
