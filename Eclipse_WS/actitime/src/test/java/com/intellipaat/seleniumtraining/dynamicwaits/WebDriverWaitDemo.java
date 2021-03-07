package com.intellipaat.seleniumtraining.dynamicwaits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitDemo {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("file:///D:/Intellipaat/Intellipaat_30_Jan_21/html/tiimeout.html");
		
		driver.findElement(By.tagName("button")).click();
		
		WebDriverWait wait  =  new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("demo"))));
		
		String text = driver.findElement(By.id("demo")).getText();
		String text2 = driver.findElement(By.id("demo2")).getText();

		System.out.println("Text : " + text);
		System.out.println("Text2 : " + text2);

		driver.close();
	}

}
