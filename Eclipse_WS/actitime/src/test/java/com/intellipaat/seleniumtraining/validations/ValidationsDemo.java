package com.intellipaat.seleniumtraining.validations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidationsDemo {
	
	public static void main(String[] args) {
		//http://formy-project.herokuapp.com/enabled
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("http://formy-project.herokuapp.com/enabled");
		
		WebElement ele  = driver.findElement(By.id("disabledInput"));
		
		System.out.println("Displayed " + ele.isDisplayed());
		System.out.println("Enabled " + ele.isEnabled());
		System.out.println("Selected " + ele.isSelected());
		System.out.println("getText " + ele.getText());
		System.out.println("getAttribute " + ele.getAttribute("id"));
		System.out.println("title of the page " + driver.getTitle());
	}

}
