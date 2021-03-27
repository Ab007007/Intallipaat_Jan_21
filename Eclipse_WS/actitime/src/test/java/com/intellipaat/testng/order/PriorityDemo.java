package com.intellipaat.testng.order;

import org.testng.annotations.Test;

public class PriorityDemo {

	
	
	@Test(priority = 0)
	public void launch1()
	{
		System.out.println("launching...");
	}
	
	@Test(priority = 1)
	public void login2()
	{
		System.out.println("login");
	}
	@Test(priority = 2)
	public void createCutomer3() {
		System.out.println("Welcome to test");
	}
	
	@Test(priority = 3)
	public void logout4()
	{
		System.out.println("logout");
	}

}
