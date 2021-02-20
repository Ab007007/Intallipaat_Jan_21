package com.intellipaat.javatraining.io;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {

	public static void main(String[] args) {

		File file = null;
		FileInputStream fis = null;

		try {
			file = new File("data/personInfo.txt");
			if(!file.exists())
			{
				file.createNewFile();
			}
			fis = new FileInputStream(file);

			System.out.println((char)fis.read());
		}
		catch (FileNotFoundException ex) {
			System.out.println("Error While creating Object to file");
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}
	}
}
