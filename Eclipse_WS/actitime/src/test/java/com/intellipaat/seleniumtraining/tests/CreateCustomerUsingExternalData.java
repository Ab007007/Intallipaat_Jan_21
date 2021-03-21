package com.intellipaat.seleniumtraining.tests;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import com.intellipaat.seleniumtraining.utils.ActitimeUtils;
import com.intellipaat.seleniumtraining.utils.ExcelHelper;
import com.intellipaat.seleniumtraining.utils.FileUtils;

public class CreateCustomerUsingExternalData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		String sheetName = "customerdata";
		ActitimeUtils.getDriver(FileUtils.getGlobalData("browser"));
		ActitimeUtils.launch(FileUtils.getGlobalData("url"));
		ActitimeUtils.login(FileUtils.getGlobalData("username"), FileUtils.getGlobalData("password"));
		ActitimeUtils.clickOnTasks();
		int rowCount = ExcelHelper.getRowCount(sheetName);
		
		for (int i = 1; i < rowCount; i++) {
			String cn = ExcelHelper.getCellValue(sheetName, i, 0);
			String cd = ExcelHelper.getCellValue(sheetName, i, 1);
			String executionStatus = ExcelHelper.getCellValue(sheetName, i, 2);
			if(executionStatus.equalsIgnoreCase("yes"))
			{
				ActitimeUtils.clickOnNewCustomerButton();
				ActitimeUtils.createCustomer(cn,cd);
				ExcelHelper.writeStatus(sheetName, i, 3, "Executed");
			}
			else
			{
				ExcelHelper.writeStatus(sheetName, i, 3, "Not - Executed");
			}
		}
		
		ActitimeUtils.logout();
		
	}
}
