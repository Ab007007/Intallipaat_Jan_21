package com.intellipaat.seleniumtraining.tests;

import com.intellipaat.seleniumtraining.utils.ActitimeUtils;

public class DeleteCustomer {

	
public static void main(String[] args) throws InterruptedException {
		
		ActitimeUtils.getDriver();
		ActitimeUtils.launch("http://localhost/login.do");
		ActitimeUtils.login("admin", "manager");
		ActitimeUtils.clickOnTasks();
		ActitimeUtils.searchCustomerAndOpenCustomerDetails("Intellipaat-Customer-Mar-1");
		ActitimeUtils.deleteCustomer();
		ActitimeUtils.logout();
		
	}
}
