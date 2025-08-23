package PageActions;

import org.openqa.selenium.WebDriver;

import PageObjects.LoginPage;
import Utilities.BaseClass;

public class LoginPageActionsWithProperies extends BaseClass{

	private LoginPage lp;
	private LoginPageActionsWithProperies(WebDriver driver) {
		lp = LoginPage.getLoginPage(driver);
	}
	private static LoginPageActionsWithProperies lpap;
	
	public static LoginPageActionsWithProperies getLoginPageActionsWithProperies(WebDriver driver) {
		if(lpap == null) {
			lpap = new LoginPageActionsWithProperies(driver);
		}
		return lpap;
	}
	
	
	public void enterUsername(String name)  {
		logger.info("In enterUserName");
		enterText(lp.getUsername(), name);
		logger.info("User entered the username");
	}
	
	public void enterPassword(String password)  {
		enterText(lp.getPassword(), password);
		logger.info("User entered the pasword");
	}
	
	public void clickOnLoginBtn() {
		clickOnElement(lp.getLoginBtn());
		logger.info("User clicked On login btn");
	}
	
	
	
	
	
}
