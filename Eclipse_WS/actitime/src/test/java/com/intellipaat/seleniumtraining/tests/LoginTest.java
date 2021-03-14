package com.intellipaat.seleniumtraining.tests;

import org.openqa.selenium.WebDriver;

import com.intellipaat.seleniumtraining.utils.ActitimeUtils;
import com.intellipaat.seleniumtraining.utils.DriverUtils;

public class LoginTest {

	
	
	public static void main(String[] args) {
		WebDriver driver = DriverUtils.getDriver();
		
		ActitimeUtils.launch("http://localhost/login.do");
		ActitimeUtils.login("admin", "manager");
		ActitimeUtils.logout();
	}
}
