package com.intellipaat.seleniumtraining.dropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class MultiDropDownDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("file:///D:/Intellipaat/Intellipaat_30_Jan_21/html/multiSelect.html");
		
		WebElement mulitSelecctDropDown = driver.findElement(By.tagName("select"));
		
		Select sel = new Select(mulitSelecctDropDown);
		
		sel.selectByIndex(2);
		Thread.sleep(2000);
		sel.selectByValue("volvo");
		Thread.sleep(2000);
		sel.selectByVisibleText("Audi");
		Thread.sleep(2000);
		sel.deselectByIndex(0);
		Thread.sleep(2000);
		sel.deselectByValue("audi");
		Thread.sleep(2000);
		sel.deselectByVisibleText("Mercedes");
		Thread.sleep(2000);
		sel.selectByIndex(2);
		Thread.sleep(2000);
		sel.selectByValue("volvo");
		Thread.sleep(2000);
		sel.selectByVisibleText("Audi");
		Thread.sleep(2000);
		sel.deselectAll();
		
		
		
	
	
	}

}
