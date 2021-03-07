package com.intellipaat.seleniumtraining.dynamicwaits;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class FluentWaitDemo {

	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("file:///D:/Intellipaat/Intellipaat_30_Jan_21/html/tiimeout.html");
		
		driver.findElement(By.tagName("button")).click();
		
//		WebDriverWait wait  =  new WebDriverWait(driver, 30);
//		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("demo"))));
//		
		
		FluentWait<WebElement> wait  = new FluentWait<WebElement>(
				driver.findElement(By.id("demo"))).
				withTimeout(Duration.ofSeconds(30)).
				pollingEvery(Duration.ofMillis(1000)).
				ignoring(NoSuchElementException.class).
				ignoring(NullPointerException.class);
				
		Function<WebElement, Boolean> fun = new Function<WebElement, Boolean>() {
			@Override
			public Boolean apply(WebElement input) {
				boolean flag = false;
				if(input.getText().equals("Hello"))
				{
					System.out.println("Text found!!!!");
					flag = true;
				}
				else
				{
					System.out.println("Waiting!!!!!!");
				}
				
				return flag;
			}
		};
		
		
		wait.until(fun);
		
		
		
		String text = driver.findElement(By.id("demo")).getText();
		String text2 = driver.findElement(By.id("demo2")).getText();

		System.out.println("Text : " + text);
		System.out.println("Text2 : " + text2);

		driver.close();
	}
	
}
