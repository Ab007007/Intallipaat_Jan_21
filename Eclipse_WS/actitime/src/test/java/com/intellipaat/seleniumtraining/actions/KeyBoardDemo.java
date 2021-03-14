package com.intellipaat.seleniumtraining.actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.intellipaat.seleniumtraining.utils.DriverUtils;

public class KeyBoardDemo {

	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = DriverUtils.getDriver("chrome");
		
		driver.get("http://localhost/login.do");
		
		Actions act = new Actions(driver);
		
		act.sendKeys("admin").perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(2000);
		act.sendKeys("manager").perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(5000);
		
		driver.close();
	}
}
