package com.intellipaat.seleniumtraining.actitime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorldSelenium 
{

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		
		driver.close();
		
	}
}
