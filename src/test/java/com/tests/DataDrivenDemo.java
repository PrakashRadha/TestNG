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



public class DataDrivenDemo {
	
	private void readData (int sheetIndex, int rowIndex, int columnIndex) throws IOException {
		//create a file reference for xcel file
				File f = new File("C:\\Users\\praka\\Selenium\\Singleton\\TestNG\\Ecommerce\\src\\test\\resources\\TestData.xlsx");
			
				//create the file input stream reference
				FileInputStream fis = new FileInputStream(f);
			
				//create the workbook reference
				Workbook wb = new XSSFWorkbook(fis);
				
				//traverse to the sheet
				Sheet s = wb.getSheetAt(sheetIndex);
			
				//traverse to the row
				Row r = s.getRow(rowIndex);
//				System.out.println("No.of Rows : "+s.getPhysicalNumberOfRows());
				
				//traverse to cell
				Cell c = r.getCell(columnIndex);
//				System.out.println("Number of Cells: "+r.getPhysicalNumberOfCells());
				
				//retrieving the cell type
				CellType type = c.getCellType();
				
				//check the type and retrieve the value
				if(type.equals(CellType.STRING)) {
					System.out.println(c.getStringCellValue());
				}else if (type.equals(CellType.NUMERIC)) {
					double d = c.getNumericCellValue();
					int a = (int) d;
					System.out.println(a);
				}
					
					wb.close();

	}

		
		
		
		
		}
		
		
		
		
		
		
	
	
	}

