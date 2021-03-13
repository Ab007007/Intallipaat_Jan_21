package com.intellipaat.assignments.allbrowsers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.intellipaat.seleniumtraining.utils.DriverUtils;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestions {
	static WebDriver driver = null;
	public static void main(String[] args) throws InterruptedException {
		/*
		 * // WebDriverManager.chromedriver().setup(); // WebDriver driver = new
		 * ChromeDriver(); //
		 * 
		 * // WebDriverManager.firefoxdriver().setup(); // driver = new FirefoxDriver();
		 * //
		 * 
		 * WebDriverManager.edgedriver().setup(); driver = new EdgeDriver();
		 */
		driver = DriverUtils.getDriver("chrome");
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Intellipaat");
		Thread.sleep(3000);
		List<WebElement> autoSuggestions = driver.findElements(By.xpath("//ul[@class='erkvQe']/li[@role='presentation']//div[@class='sbl1']"));
		
		System.out.println("Total Suggestions displayed is " + autoSuggestions.size());
		for (WebElement autosuggestion : autoSuggestions) 
		{
			System.out.println(autosuggestion.getText());
		}
	
		driver.close();
	
		
		
	}

}
