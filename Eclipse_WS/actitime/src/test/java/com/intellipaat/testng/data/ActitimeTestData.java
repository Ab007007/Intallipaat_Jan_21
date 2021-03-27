package com.intellipaat.testng.data;

import org.testng.annotations.DataProvider;

public class ActitimeTestData {

	
	 @DataProvider
	  public Object[][] createcustomerdata() {
	    return new Object[][] {
	      new Object[] { "TestNG-Int-Cust5","TestNG-Int-CustDesc1" },
	      new Object[] { "TestNG-Int-Cust6","TestNG-Int-CustDesc2" },
	    };
	  }
	 
	 
	 @DataProvider
	  public Object[][] createprojectdata() {
	    return new Object[][] {
	      new Object[] { "Project1","TestNG-Int-Cust1","Project1-Desc" },
	      new Object[] { "Project2","TestNG-Int-Cust1","Project1-Desc" },
	      new Object[] { "Project1","TestNG-Int-Cust2","Project1-Desc" },
	      new Object[] { "Project2","TestNG-Int-Cust2","Project1-Desc" },
	      new Object[] { "Project1","TestNG-Int-Cust3","Project1-Desc" },
	    };
	  }
}
