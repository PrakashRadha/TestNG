package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	
	public static WebDriver driver;
	
	
	
	public static WebDriver browserLaunch(String browserName) {
		if(browserName.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		}else if (browserName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}else if (browserName.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		}
		
		return driver;
	}
	public static final Logger logger = LogManager.getLogger(BaseClass.class);
	public static void maximizeWindow() {
		driver.manage().window().maximize();
	}
	
	public static void implicitWait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	public static void launchApp(String url) {
		driver.get(url);
	}
	
	public static String getTitle() {
		return driver.getTitle();
	}
	
	public static void enterText(WebElement element, String value) {
		element.sendKeys(value);
	}
	
	public static void clickOnElement(WebElement element) {
		element.click();
	}

	public static void clearField(WebElement element) {
		element.clear();
	}
	
	public static void switchToAlert(String action, String value) {
		Alert a = driver.switchTo().alert();
		if(action.equalsIgnoreCase("accept")) {
			a.accept();
		}else if(action.equalsIgnoreCase("dismiss")) {
			a.dismiss();
		}else if(action.equalsIgnoreCase("sendKeys")) {
			a.sendKeys(value);
		}
	}
	
	public static String getTextFromAlert() {
		Alert a = driver.switchTo().alert();
		return a.getText();
	}
	
	public static void lowWait() throws InterruptedException {
		Thread.sleep(2000);
	}
	
	public static void selectAnElement(WebElement element, String selectMethod, String value, int index) {
		Select s = new Select(element);
		if(selectMethod.equalsIgnoreCase("byValue")) {
			s.selectByValue(value);
		}else if (selectMethod.equalsIgnoreCase("byVisisbleText")) {
			s.selectByVisibleText(value);
		}else if(selectMethod.equalsIgnoreCase("byIndex")) {
			s.selectByIndex(index);
		}
	}
	
	public static void waitUntilVisibility(WebElement element, int duration) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	
	
	public static void tearDown() {
		driver.close();
	}
	
	public static String getData(String file, int SheetIndex, int rowIndex, int cellIndex) throws IOException {
		String value = "";
		
		File f = new File(file);
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet s = wb.getSheetAt(SheetIndex);
		Row r = s.getRow(rowIndex);
		Cell c = r.getCell(cellIndex);
		CellType type = c.getCellType();
		if(type.equals(CellType.STRING)) {
			value = c.getStringCellValue();
		}else if(type.equals(CellType.NUMERIC)) {
			double d = c.getNumericCellValue();
			int a = (int) d;
			value = Integer.toString(a);
		}
		
		return value;
	}
	
	public static void writeData(String file, int SheetIndex, int rowIndex, int cellIndex, String value) throws IOException {
		
		File f = new File(file);
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet s = wb.getSheetAt(SheetIndex);
		Row r = s.getRow(rowIndex);
		Cell c = r.getCell(cellIndex);
		c.setCellValue(value);
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
		wb.close();
		
		
	}
	
	public static String readDataFromPropertiesFile(String file, String Key) throws IOException {
		String value = "";
		
		File f = new File(file);
		FileInputStream fis = new FileInputStream(f);
		Properties p = new Properties();
		p.load(fis);
		value = p.getProperty(Key);
			
		return value;
	}
	
	public static void writeDataIntoPropertiesFile(String file, String key, String value, String message) throws IOException {
	
		File f = new File(file);
		FileInputStream fis = new FileInputStream(f);
		Properties p = new Properties();
		p.load(fis);
		p.setProperty(key, value);
		FileOutputStream fos = new FileOutputStream(f);
		p.store(fos, message);
		fos.close();
		
		
	}
	


	
	
}
