package com.intellipaat.assignments.popup;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.intellipaat.seleniumtraining.utils.ActitimeUtils;
import com.intellipaat.seleniumtraining.utils.FileUtils;

public class FileUploadDemo {

	public static void main(String[] args) throws InterruptedException, IOException {

		String browsertype = FileUtils.getGlobalData("browser");

		switch (browsertype) {
		case "chrome":
			Runtime.getRuntime().exec("D:\\Intellipaat\\Intellipaat_30_Jan_21\\autoIT\\fileUpload.exe");
			break;
		case "ff":
			// TODO: Implementation is pending
			break;
		case "edge":
			Runtime.getRuntime().exec("D:\\Intellipaat\\Intellipaat_30_Jan_21\\autoIT\\fileUpload.exe");
			break;

		default:
			break;
		}

		WebDriver driver = ActitimeUtils.getDriver("edge");
		
		ActitimeUtils.launch("http://formy-project.herokuapp.com/fileupload");

		driver.findElement(By.id("file-upload-field")).click();

	}

}
