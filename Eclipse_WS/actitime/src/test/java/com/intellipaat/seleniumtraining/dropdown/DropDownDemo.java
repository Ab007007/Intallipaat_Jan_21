package com.intellipaat.seleniumtraining.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DropDownDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://formy-project.herokuapp.com/form");

		// WebElement firstNameTextBox = driver.findElement(By.id("first-name")) ;
		// firstNameTextBox.sendKeys("ARAVINDA");
		driver.findElement(By.id("first-name")).sendKeys("ARAVINDA");
		Thread.sleep(2000);
		driver.findElement(By.id("last-name")).sendKeys("AHB");
		Thread.sleep(2000);
		driver.findElement(By.id("job-title")).sendKeys("Trainer");
		Thread.sleep(2000);

		driver.findElement(By.id("radio-button-3")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("checkbox-1")).click();
		Thread.sleep(2000);

		Select sel = new Select(driver.findElement(By.id("select-menu")));
		sel.selectByIndex(1);
		Thread.sleep(2000);
		sel.selectByValue("4");
		Thread.sleep(2000);
		sel.selectByVisibleText("2-4");
		Thread.sleep(2000);
		
		
		driver.findElement(By.id("datepicker")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[text()='12']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[text()='Submit']")).click();

		Thread.sleep(2000);
		String successMsg = driver.findElement(By.xpath("//div[@role='alert']")).getText();
		System.out.println(successMsg);
		Thread.sleep(2000);
		driver.close();
	}
}
