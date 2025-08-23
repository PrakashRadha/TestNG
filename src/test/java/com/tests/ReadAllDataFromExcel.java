package com.tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadAllDataFromExcel {
	public static void main(String[] args) throws IOException {
		// create a file reference for xcel file
		File f = new File(
				"C:\\Users\\praka\\Selenium\\Singleton\\TestNG\\Ecommerce\\src\\test\\resources\\TestData.xlsx");

		// create the file input stream reference
		FileInputStream fis = new FileInputStream(f);

		// create the workbook reference
		Workbook wb = new XSSFWorkbook(fis);

		// traverse to the sheet
		Sheet s = wb.getSheetAt(0);

		// traverse to the row
		int numOfRows = s.getPhysicalNumberOfRows();

		for (int i = 0; i < numOfRows; i++) {
			Row r = s.getRow(i);
			int numOfCells = r.getPhysicalNumberOfCells();

			for (int j = 0; j < numOfCells; j++) {
				Cell c = r.getCell(j);
				CellType type = c.getCellType();

				// check the type and retrieve the value
				if (type.equals(CellType.STRING)) {
					System.out.println(c.getStringCellValue());
				} else if (type.equals(CellType.NUMERIC)) {
					double d = c.getNumericCellValue();
					int a = (int) d;
					System.out.println(a);
				}
			}
		}

	}
}
