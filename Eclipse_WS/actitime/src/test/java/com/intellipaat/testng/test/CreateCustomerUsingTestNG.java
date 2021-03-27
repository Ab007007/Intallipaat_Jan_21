package com.intellipaat.testng.test;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.intellipaat.seleniumtraining.utils.ActitimeUtils;
import com.intellipaat.testng.data.ActitimeTestData;

public class CreateCustomerUsingTestNG {

	WebDriver driver = null;
	
	@Parameters({"url", "username", "password"})
	@BeforeTest
	public void launchAndLogin(String url, String un, String pwd)
	{
		
		driver = ActitimeUtils.getDriver();
		ActitimeUtils.launch(url);
		ActitimeUtils.login(un,pwd);
		ActitimeUtils.clickOnTasks();
	}
	
	@AfterTest
	public void logout()
	{
		ActitimeUtils.logout();
		driver.close();
	}
	
	@Test(dataProvider = "createcustomerdata", dataProviderClass = ActitimeTestData.class)
	public void createCustomer(String cn, String cd)
	{
		Reporter.log("Creating customer with " + cn +  " and " + cd +  "<br>");
		ActitimeUtils.clickOnNewCustomerButton();
		ActitimeUtils.createCustomer(cn, cd);
		
	}
}
