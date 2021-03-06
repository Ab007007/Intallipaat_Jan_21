package com.intellipaat.seleniumtraining.tooltips;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTipInGoogle {

	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		
		String toolTip = driver.findElement(By.xpath("//a[@role='button' and @class='gb_D']")).getAttribute("aria-label");
	
		System.out.println(toolTip);
		driver.close();
	}
}
