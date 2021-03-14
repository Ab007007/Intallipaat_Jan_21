package com.intellipaat.assignments.pagination;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.intellipaat.seleniumtraining.utils.ActitimeUtils;

public class PagenationDemo {

	public static void main(String[] args) {
		WebDriver driver  = ActitimeUtils.getDriver();
		
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Intellipaat");
		driver.findElement(By.xpath("//input[@value='Google Search']")).click();
		
		for (int i = 1; i <= 5; i++) {
			List<WebElement> searchResults = driver.findElements(By.tagName("h3"));
			for (WebElement reslut : searchResults) {
				System.out.println(reslut.getText());
			}
			int j = i+1;
			driver.findElement(By.xpath("//a[text()='" + j + "']")).click();
			System.out.println("--------------End of Page " +  i + " ----------");
		}
		
		
		
	}
}
