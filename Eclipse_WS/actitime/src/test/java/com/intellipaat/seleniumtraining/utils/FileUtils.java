package com.intellipaat.seleniumtraining.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class FileUtils {
	
	
	public static String getGlobalData(String key)
	{
		Properties props = null;
		File file = null;
		FileInputStream fis = null;
		String value = null;
		
		file = new File("data/globaldata.properties");
		try {
			fis = new FileInputStream(file);
			props = new Properties();
			props.load(fis);
			value = props.getProperty(key);
			System.out.println("--- Global value " + key  + " : " + value);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				System.out.println("---closing resource--");
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return value;
		
	}
	
	

}
