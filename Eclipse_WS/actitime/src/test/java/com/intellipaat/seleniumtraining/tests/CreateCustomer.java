package com.intellipaat.seleniumtraining.tests;

import com.intellipaat.seleniumtraining.utils.ActitimeUtils;

public class CreateCustomer {

	public static void main(String[] args) {
		
		ActitimeUtils.getDriver();
		ActitimeUtils.launch("http://localhost/login.do");
		ActitimeUtils.login("admin", "manager");
		ActitimeUtils.clickOnTasks();
		ActitimeUtils.clickOnNewCustomerButton();
		ActitimeUtils.createCustomer("Intellipaat-Customer-Mar-1", "Intellipaat-CustomerDesc-Mar-1");
		ActitimeUtils.logout();
		
	}
}
