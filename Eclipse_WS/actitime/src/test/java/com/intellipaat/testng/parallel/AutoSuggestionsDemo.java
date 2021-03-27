package com.intellipaat.testng.parallel;

import org.testng.Reporter;
import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionsDemo {

	
	@Test
	public void autoSuggestion() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Intellipaat");
		Thread.sleep(3000);
		List<WebElement> autoSuggestions = driver.findElements(By.xpath("//ul[@class='erkvQe']/li[@role='presentation']//div[@class='sbl1']"));
		
		Reporter.log("Total Suggestions displayed is " + autoSuggestions.size() + "<br>");
		for (WebElement autosuggestion : autoSuggestions) 
		{
			Reporter.log(autosuggestion.getText() + "<br>");
		}
	
		driver.close();
	}
}
