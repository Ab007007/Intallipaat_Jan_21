package com.intellipaat.testng.allannotations;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.intellipaat.testng.data.ActitimeTestData;


public class LocalDataDemo {
 

	@Parameters({"url","username","password", "browser"})
	@BeforeTest
	public void launchAndLogin(String url, String un, String pwd, String brow)
	{
		System.out.println(url);
		System.out.println(un);
		System.out.println(pwd);
		System.out.println(brow);
	}
	
	@AfterTest
	public void logout()
	{
		
	}

  @Test(dataProvider = "createcustomerdata", dataProviderClass = ActitimeTestData.class)
  public void createCustomer(String cn, String cd) {
	  
	  System.out.println(cn + " and " + cd);
  }
 
}
