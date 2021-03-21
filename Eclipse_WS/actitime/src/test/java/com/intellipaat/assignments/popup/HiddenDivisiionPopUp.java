package com.intellipaat.assignments.popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.intellipaat.seleniumtraining.utils.ActitimeUtils;

public class HiddenDivisiionPopUp {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = ActitimeUtils.getDriver("ff");
		ActitimeUtils.launch("http://formy-project.herokuapp.com/modal");
		
		driver.findElement(By.id("modal-button")).click();
		Thread.sleep(3000);
		System.out.println("Text on popup : " + driver.findElement(By.className("modal-body")).getText());
		Thread.sleep(3000);
		driver.findElement(By.id("close-button")).click();
		
	}

}
