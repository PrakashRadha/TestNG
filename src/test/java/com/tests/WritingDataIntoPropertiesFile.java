package com.tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WritingDataIntoPropertiesFile {
	
	private static void writeDataIntoPropertiesFile(String file, String key, String value, String message) throws IOException {
		File f = new File(file);
		FileInputStream fis = new FileInputStream(f);
		Properties p = new Properties();
		p.load(fis);
		p.setProperty(key, value);
		FileOutputStream fos = new FileOutputStream(f);
		p.store(fos, message);
		fos.close();
	}

	public static void main(String[] args) throws IOException {
		
//		File f = new File("C:\\Users\\praka\\Selenium\\Singleton\\TestNG\\Ecommerce\\src\\test\\resources\\testData.properties");
//		
//		FileInputStream fis = new FileInputStream(f);
//		
//		Properties p = new Properties();
//		
//		p.load(fis);
//		
//		p.setProperty("place", "Chennai");
//		
//		FileOutputStream fos = new FileOutputStream(f);
//		
//		p.store(fos, "Updated with Place");
//	
//		
//		fos.close();
		writeDataIntoPropertiesFile("C:\\Users\\praka\\Selenium\\Singleton\\TestNG\\Ecommerce\\src\\test\\resources\\testData.properties", "placeNearBy", "Madurai", "Updated");
		System.out.println("File updated");
		
	}

}
