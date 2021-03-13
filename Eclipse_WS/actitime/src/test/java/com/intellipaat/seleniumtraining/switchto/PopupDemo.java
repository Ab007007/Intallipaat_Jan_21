package com.intellipaat.seleniumtraining.switchto;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupDemo {

	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("http://localhost/login.do");
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//div[text()='TASKS']/parent::a")).click();
		driver.findElement(By.xpath("//div[@class='addNewContainer']")).click();
		driver.findElement(By.xpath("//div[@class='item createNewCustomer ellipsis']")).click();
		
		driver.findElement(By.id("customerLightBox_nameField")).sendKeys("JUNK DATA");
		driver.findElement(By.id("customerLightBox_cancelBtn")).click();
		Thread.sleep(3000);
		System.out.println(driver.switchTo().alert().getText());
		
		driver.switchTo().alert().dismiss();
		Thread.sleep(3000);
			
		driver.findElement(By.id("customerLightBox_cancelBtn")).click();
		Thread.sleep(3000);
		
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		
		driver.findElement(By.id("logoutLink")).click();
		
		
		
		
		
	}
}
