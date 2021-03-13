package com.intellipaat.seleniumtraining.switchto;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingElementInFrame {

	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("http://jqueryui.com/");
		driver.findElement(By.linkText("Droppable")).click();
		
		//driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@src,'default')]")));
		String text = driver.findElement(By.id("draggable")).getText();
		System.out.println(text);
		
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Sortable")).click();
	}
}
