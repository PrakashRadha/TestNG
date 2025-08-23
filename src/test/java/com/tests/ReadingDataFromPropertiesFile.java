package com.tests;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadingDataFromPropertiesFile {
	
	private static String readData(String file, String key) throws Exception {
		File f = new File(file);
		FileInputStream fis = new FileInputStream(f);
		Properties p = new Properties();
		p.load(fis);
		String value = p.getProperty(key);
		return value;
	}

	public static void main(String[] args) throws Exception {
		
//		File f = new File("C:\\Users\\praka\\Selenium\\Singleton\\TestNG\\Ecommerce\\src\\test\\resources\\testData.properties");
//		
//		FileInputStream fis = new FileInputStream(f);
//		
//		//create object for properties
//		Properties p = new Properties();
//		
//		//load the file into properties
//		p.load(fis);
//
//		//read the data from file
//		System.out.println("Username: "+p.getProperty("username"));
//		System.out.println("Email: "+p.getProperty("email"));
//		System.out.println("Phonenumber: "+p.getProperty("phonenum"));
		
		System.out.println(readData("C:\\Users\\praka\\Selenium\\Singleton\\TestNG\\Ecommerce\\src\\test\\resources\\testData.properties", "username"));
		System.out.println(readData("C:\\Users\\praka\\Selenium\\Singleton\\TestNG\\Ecommerce\\src\\test\\resources\\testData.properties", "email"));
		System.out.println(readData("C:\\Users\\praka\\Selenium\\Singleton\\TestNG\\Ecommerce\\src\\test\\resources\\testData.properties", "phonenum"));
	}

}
