package com.intellipaat.seleniumtraining.actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.intellipaat.seleniumtraining.utils.DriverUtils;

public class MouseOperationsDemo {

	static WebDriver driver = null;
	public static void main(String[] args) throws InterruptedException {
		
		driver = DriverUtils.getDriver("chrome");
		driver.get("https://www.flipkart.com/");
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement loginCloseButton = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"))));
		loginCloseButton.click();
		
		WebElement fashionElement = driver.findElement(By.xpath("//div[text()='Fashion']/ancestor::div[@class='_1psGvi SLyWEo']"));
		WebElement electronicsElement = driver.findElement(By.xpath("//div[text()='Electronics']/ancestor::div[@class='_1psGvi SLyWEo']"));
		WebElement homeElement = driver.findElement(By.xpath("//div[text()='Home']/ancestor::div[@class='_1psGvi SLyWEo']"));
		WebElement appliancesElement = driver.findElement(By.xpath("//div[text()='Appliances']/ancestor::div[@class='_1psGvi SLyWEo']"));
	
	
		Actions act = new Actions(driver);
		
		act.moveToElement(fashionElement).perform();
		Thread.sleep(3000);
		printSuggestedElements();
		act.moveToElement(electronicsElement).perform();
		Thread.sleep(3000);
		printSuggestedElements();
		act.moveToElement(homeElement).perform();
		Thread.sleep(3000);
		printSuggestedElements();
		act.moveToElement(appliancesElement).perform();
		Thread.sleep(3000);
		printSuggestedElements();
		
		//driver.close();
	
	
	}
	
	public static void printSuggestedElements()
	{
		System.out.println("-----------------------------------------------------------------------");
		List<WebElement> mHElements = driver.findElements(By.xpath("//a[@class='_6WOcW9']"));
		for (WebElement ele : mHElements) 
		{
			System.out.println(ele.getText());
			
		}
		System.out.println("-----------------------------------------------------------------------");
		
	}
}
