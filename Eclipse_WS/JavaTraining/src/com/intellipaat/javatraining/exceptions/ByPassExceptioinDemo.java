package com.intellipaat.javatraining.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ByPassExceptioinDemo {

	
	public static void main(String[] args) {
		
		System.out.println("--- main Started ---");
		try {
			fileReader();
		}catch(Exception ex)
		{
			System.out.println("Exception while using fileReader method");
		}
		System.out.println("--- main Ended ---");
	}
	
	
	
	public static void fileReader() throws FileNotFoundException
	{
		System.out.println("file reader started");
		FileInputStream fis = new FileInputStream("AFDA");
		
		System.out.println("file reader ended");
				
		
	}
}
