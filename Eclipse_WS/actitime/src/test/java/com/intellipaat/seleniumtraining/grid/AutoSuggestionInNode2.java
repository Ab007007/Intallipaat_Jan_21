package com.intellipaat.seleniumtraining.grid;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.intellipaat.seleniumtraining.utils.FileUtils;

public class AutoSuggestionInNode2 {

	
	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		String nodeUrl  =FileUtils.getGlobalData("node2");
		
		//ChromeOptions options = new ChromeOptions();
		FirefoxOptions options = new FirefoxOptions();
//		EdgeOptions options = new EdgeOptions();
		options.setCapability(CapabilityType.PLATFORM_NAME, Platform.WINDOWS);
		options.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.ACCEPT);
		options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		options.setCapability(CapabilityType.UNHANDLED_PROMPT_BEHAVIOUR, true);
//		options.addArguments("disable-infobars");
		WebDriver driver = new RemoteWebDriver(new URL(nodeUrl),options);
		
		
		
		
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Intellipaat");
		Thread.sleep(3000);
		List<WebElement> autoSuggestions = driver.findElements(By.xpath("//ul[@class='erkvQe']/li[@role='presentation']//div[@class='sbl1']"));
		
		System.out.println("Total Suggestions displayed is " + autoSuggestions.size());
		for (WebElement autosuggestion : autoSuggestions) 
		{
			System.out.println(autosuggestion.getText());
		}
	
		driver.close();
	
	
	}
}
