package PageActions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObjects.LoginPage;
import Utilities.BaseClass;

public class LoginPageActions extends BaseClass{
 
	private LoginPage lp;
	private LoginPageActions(WebDriver driver) {
	 lp = LoginPage.getLoginPage(driver);
	}
	
	private static LoginPageActions lpa;
	
	public static LoginPageActions getLoginPageActions(WebDriver driver) {
		if(lpa == null) {
			lpa = new LoginPageActions(driver);
		}
		return lpa;
	}
	
	
	public void enterUsername(String name) {
		logger.info("In enterUserName");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf(lp.getUsername()));
		enterText(lp.getUsername(), name);
		logger.info("User entered the username");
	}
	
	public void enterPassword(String password) {
		enterText(lp.getPassword(), password);
		logger.info("User entered the pasword");
	}
	
	public void clickOnLoginBtn() {
		clickOnElement(lp.getLoginBtn());
		logger.info("User clicked On login btn");
		
	}
	
	public String getErrorMessage() {
	String value = lp.getAuthError().getText();
	return value;
	}
	
	public boolean isErrorMessageDisplayed() {
		boolean isDisplayed = lp.getAuthError().isDisplayed();
		return isDisplayed;
	}
	
	public String getSearchPageTitle() {
		String value = lp.getSearchHotelPageTitle().getText();
		return value;
	}
	
	
	
	
	
	
	
	
	
	
}
