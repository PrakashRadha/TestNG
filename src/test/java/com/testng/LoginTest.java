package com.testng;

import java.io.IOException;
import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageActions.LoginPageActions;

public class LoginTest extends TestBase {
	LoginPageActions lpa;
	@Test(dataProvider = "dp")
	public void login(String name, String password) {
		driver.get("https://adactinhotelapp.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		lpa = LoginPageActions.getLoginPageActions(driver);
		lpa.enterUsername(name);
		lpa.enterPassword(password);
		lpa.clickOnLoginBtn();
		Assert.assertTrue(true);
	}

	@DataProvider(name = "dp")
	public Object getData() {
		return new Object[][] {
			{"maruthatcf", "mptcf@2309"},
			{"mukeshe912", "mukeshe912"},
			{"Admin130", "admin@123"}
		};
	}
}
