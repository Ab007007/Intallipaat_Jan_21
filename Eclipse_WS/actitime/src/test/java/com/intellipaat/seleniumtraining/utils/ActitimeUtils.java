package com.intellipaat.seleniumtraining.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActitimeUtils extends DriverUtils
{
	
	
	public static void launch(String url)
	{
		System.out.println("-- launching application " + url);
		driver.get(url);
	}

	public static void login(String un, String pwd)
	{
		System.out.println("---logging in with " + un + "  and " + pwd);
		driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(pwd);
		driver.findElement(By.id("loginButton")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void logout()
	{
		System.out.println("---loggingout of the application---");
		driver.findElement(By.id("logoutLink")).click();
		driver.close();
	}
	
	public static void clickOnTasks()
	{
		System.out.println("Clicking on Tasks");
		driver.findElement(By.xpath("//div[text()='TASKS']/parent::a")).click();
	}
	
	public static void clickOnNewCustomerButton()
	{
		System.out.println("--- clicking on Add New and  New Customer ---");
		driver.findElement(By.xpath("//div[@class='addNewContainer']")).click();
		driver.findElement(By.xpath("//div[@class='item createNewCustomer ellipsis']")).click();
		
	}
	
	public static void createCustomer(String cn, String cd)
	{
		System.out.println("--- Creating customer with " + cn + " and " + cd);
		driver.findElement(By.id("customerLightBox_nameField")).sendKeys(cn);
		driver.findElement(By.id("customerLightBox_descriptionField")).sendKeys(cd);
		driver.findElement(By.id("customerLightBox_commitBtn")).click();
		
		System.out.println("Waiting for toast Success message to appear");
		WebDriverWait wait =  new WebDriverWait(driver, 10);
		WebElement ele = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='toast']"))));
		
		System.out.println("Success message " + ele.getText());
		System.out.println("Waiting for the success message to dissappear");
		
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//div[@class='toast']"))));
	}
	
	public static void searchCustomerAndOpenCustomerDetails(String name) throws InterruptedException
	{
		System.out.println("--- Searching for the customer " + name);
		driver.findElement(By.xpath("//div[@class='customersProjectsPanel']//input")).sendKeys(name);
	
		WebElement gearIcon = driver.findElement(By.xpath("//div[@class='filteredContainer']//div[@class='editButton available']"));
		Actions act = new Actions(driver);
		act.moveToElement(gearIcon).perform();
		Thread.sleep(3000);
		act.click(gearIcon).perform();
		Thread.sleep(3000);
		
	}
	
	public static void deleteCustomer()
	{
		driver.findElement(By.xpath("//div[@class='edit_customer_sliding_panel sliding_panel']//div[text()='ACTIONS']")).click();
		driver.findElement(By.xpath("//div[@class='edit_customer_sliding_panel sliding_panel']//div[text()='Delete']")).click();
		driver.findElement(By.id("customerPanel_deleteConfirm_submitTitle")).click();
		
		System.out.println("Waiting for toast Success message to appear");
		WebDriverWait wait =  new WebDriverWait(driver, 10);
		WebElement ele = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='toast']"))));
		
		System.out.println("Success message " + ele.getText());
		System.out.println("Waiting for the success message to dissappear");
		
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//div[@class='toast']"))));
	}
}
