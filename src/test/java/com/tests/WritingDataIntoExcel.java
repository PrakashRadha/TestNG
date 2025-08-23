package com.tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataIntoExcel {
	
	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\praka\\Selenium\\Singleton\\TestNG\\Ecommerce\\src\\test\\resources\\TestData.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet s = wb.getSheetAt(1);
		
		Row r = s.createRow(0);
		
		Cell c = r.createCell(0);
		
		c.setCellValue("Username");
		
		 Row r1 = s.createRow(1);
		 Cell c1 = r1.createCell(0);
		 c1.setCellValue("Kannan");
		
		FileOutputStream fos = new FileOutputStream(f);
		
		wb.write(fos);
		
		wb.close();
		
		System.out.println("Program Executed");
		
		
		
		
		
	}

}
