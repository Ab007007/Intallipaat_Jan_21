package com.intellipaat.seleniumtraining.switchto;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultiBrowser {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("http://localhost/login.do");
		Thread.sleep(5000);
		driver.findElement(By.id("licenseLink")).click();
		Thread.sleep(5000);
		Set<String> windowIDs = driver.getWindowHandles();   //LinkedHashSet
		
		Iterator<String> it = windowIDs.iterator();
		
		String parentID = it.next();
		String childID = it.next();
		
		System.out.println(parentID);
		System.out.println(childID);
		
		driver.switchTo().window(childID);
		
		List<WebElement> headings = driver.findElements(By.xpath("//h2"));
		
		System.out.println("Total headings in child browser is " + headings.size());
		for (WebElement heading : headings) {
			System.out.println(heading.getText());
			
		}
		
		driver.close();
		
		driver.switchTo().window(parentID);
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		Thread.sleep(5000);
	
		driver.findElement(By.id("logoutLink")).click();
		
		driver.close();
	}

}
