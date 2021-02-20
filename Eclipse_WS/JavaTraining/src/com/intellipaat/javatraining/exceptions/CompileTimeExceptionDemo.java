package com.intellipaat.javatraining.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CompileTimeExceptionDemo {

	
	public static void main(String[] args) {
		
		System.out.println("--- main Started ---");
		try 
		{
			System.out.println("Reading a file");
			FileInputStream fis = new FileInputStream("data/temp.txt");
			////
			System.out.println("Reading is successfull");
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("Arrayindex out of bound");
		}
		catch (FileNotFoundException e) {
			System.out.println("Exception while reading a file");
		}
		finally
		{
			System.out.println("Finally is Executed!!!!");
		}
		
		System.out.println("--- main Ended ---");
	}
}
