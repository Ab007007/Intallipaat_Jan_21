package com.intellipaat.javatraining.io;


import java.io.File;
import java.io.IOException;

public class CreateNewFileDemo {

	
	public static void main(String[] args) {
		
		File f = new File("data/newFile.txt");
		try {
			f.createNewFile();
		} catch (IOException e) {
			System.out.println("can't create file " + e.getMessage());
		}
	}
}
