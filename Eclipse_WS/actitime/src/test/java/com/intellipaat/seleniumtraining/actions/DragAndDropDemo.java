package com.intellipaat.seleniumtraining.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.intellipaat.seleniumtraining.utils.DriverUtils;

import com.intellipaat.seleniumtraining.utils.ActitimeUtils;

public class DragAndDropDemo {

	static WebDriver driver = null;
	
	public static void main(String[] args) throws InterruptedException 
	{
		driver = DriverUtils.getDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);
		WebElement sourceEle = driver.findElement(By.id("draggable"));
		WebElement destEle = driver.findElement(By.id("droppable"));
		
		System.out.println("---Draggable ---" + sourceEle.getText());
		System.out.println("---Droppable ---" + destEle.getText());
		
		Actions act = new Actions(driver);
		act.dragAndDrop(sourceEle, destEle).perform();
		System.out.println("---Draggable ---" + sourceEle.getText());
		System.out.println("---Droppable ---" + destEle.getText());
		Thread.sleep(5000);
		driver.close();
		
	}
}
