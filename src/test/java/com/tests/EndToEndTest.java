package com.tests;

import PageActions.LoginPageActionsWithProperies;
import Utilities.BaseClass;


public class EndToEndTest extends BaseClass{
	public static void main(String[] args) throws InterruptedException, Exception {

		browserLaunch("Edge");
		maximizeWindow();
		launchApp("https://adactinhotelapp.com/");
		implicitWait();
		lowWait();
		
		LoginPageActionsWithProperies lpa = LoginPageActionsWithProperies.getLoginPageActionsWithProperies(driver);
		lpa.enterUsername(readDataFromPropertiesFile("C:\\Users\\praka\\Selenium\\Singleton\\TestNG\\Ecommerce\\src\\test\\resources\\testData.properties", "username"));
		lpa.enterPassword(readDataFromPropertiesFile("C:\\Users\\praka\\Selenium\\Singleton\\TestNG\\Ecommerce\\src\\test\\resources\\testData.properties", "password"));
		
//		lpa.enterUsername();
//		lpa.enterPassword();
		lpa.clickOnLoginBtn();
//		tearDown();
//		
		Thread.sleep(3000);
//		browserLaunch("Edge");
//		maximizeWindow();
		launchApp("https://adactinhotelapp.com/");
//		implicitWait();
//		lowWait();
//		LoginPageActions lpa1 = LoginPageActions.getLoginPageActions(driver);
		lpa.enterUsername(readDataFromPropertiesFile("C:\\Users\\praka\\Selenium\\Singleton\\TestNG\\Ecommerce\\src\\test\\resources\\testData.properties", "username1"));
		lpa.enterPassword(readDataFromPropertiesFile("C:\\Users\\praka\\Selenium\\Singleton\\TestNG\\Ecommerce\\src\\test\\resources\\testData.properties", "password1"));
		
//		lpa.enterUsername();
//		lpa.enterPassword();
		lpa.clickOnLoginBtn();
////		tearDown();
//		
////		browserLaunch("Edge");
////		maximizeWindow();
//		launchApp("https://adactinhotelapp.com/");
//		implicitWait();
//		lowWait();
//		
////		LoginPageActions lpa2 = LoginPageActions.getLoginPageActions(driver);
//		lpa.enterUsername();
//		lpa.enterPassword();
//	
//		Thread.sleep(2000);
//		lpa.clickOnLoginBtn();
	
		tearDown();
		
		
	}
}
