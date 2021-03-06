package com.intellipaat.seleniumtraining.autosuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionsGoogleDemo {

	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Intellipaat");
		Thread.sleep(3000);
		List<WebElement> autoSuggestions = driver.findElements(By.xpath("//ul[@class='erkvQe']/li[@role='presentation']//div[@class='sbl1']"));
		
		System.out.println("Total Suggestions displayed is " + autoSuggestions.size());
		for (WebElement autosuggestion : autoSuggestions) 
		{
			System.out.println(autosuggestion.getText());
		}
	
	
	
	
	}
}
