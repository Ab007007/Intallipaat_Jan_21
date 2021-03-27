package com.intellipaat.testng.order;

import org.testng.annotations.Test;

public class OrderOfExecutionDemo {

	
	
	@Test
	public void launch()
	{
		System.out.println("launching...");
	}
	
	@Test(dependsOnMethods = "launch")
	public void login()
	{
		System.out.println("login");
	}
	@Test(dependsOnMethods = "login" )
	public void createCutomer() {
		System.out.println("Welcome to test");
	}
	
	@Test(dependsOnMethods = "createCutomer")
	public void logout()
	{
		System.out.println("logout");
	}

}
