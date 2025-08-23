package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class LoginPage extends BasePage {
	
	private LoginPage(WebDriver driver) {
		super(driver);	
	}
	
	private static LoginPage lp;
	
	public static LoginPage getLoginPage(WebDriver driver) {
		if(lp==null) {
			lp = new LoginPage(driver);
		}
		return lp;
	}
	
	
	@FindBy(id = "username")
	private WebElement username;
	
	@FindBy(id = "password")
	private WebElement password;
	
	@FindBy(id = "login")
	private WebElement loginBtn;
	
	@FindBy(xpath = "//div[@class='auth_error']/b")
	private WebElement authError;
	
	@FindBy(className = "login_title")
	private WebElement searchHotelPageTitle;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public WebElement getAuthError() {
		return authError;
	}

	public WebElement getSearchHotelPageTitle() {
		return searchHotelPageTitle;
	}

	

	
	


	
	
	
	
}
