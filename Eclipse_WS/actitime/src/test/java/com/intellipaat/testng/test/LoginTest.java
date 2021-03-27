package com.intellipaat.testng.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.intellipaat.seleniumtraining.utils.ActitimeUtils;

public class LoginTest {

	WebDriver driver = null;
	
	@BeforeClass
	public void createDriver()
	{
		driver = ActitimeUtils.getDriver();
	}
	
	@AfterClass
	public void closeDriver()
	{
		driver.close();
	}
	
	@BeforeMethod
	public void launch()
	{
		ActitimeUtils.launch("http://localhost/login.do");
	}
	
	@AfterMethod
	public void logout()
	{
		ActitimeUtils.logout();
	}
	
	@Test(priority = 1)
	public void loginWithValidCreds()
	{
		ActitimeUtils.login("admin", "manager");
	}
	@Test(priority = 2)
	public void loginWithInValidCreds()
	{
		ActitimeUtils.login("admin1", "manager1");
	}
	
	
}
