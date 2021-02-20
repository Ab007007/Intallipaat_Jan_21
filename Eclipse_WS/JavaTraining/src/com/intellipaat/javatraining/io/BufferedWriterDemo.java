package com.intellipaat.javatraining.io;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
	
	public static void main(String[] args) throws IOException {
		File file = null;
		int num = 21;
		file = new File("data/newFile.txt");
		
		BufferedWriter bw = new BufferedWriter(new FileWriter(file,true));
		bw.write("--------------Generating Table for " + num + "----------------------------------");
		bw.newLine();
		for (int i = 1; i <= 10; i++) {
			bw.write(num + " * " + i + " = " + (num*i));
			bw.newLine();
		}
		bw.newLine();
		bw.write("-------------------------------------------------");
		bw.newLine();
		bw.flush();
		bw.close();
		
	}

}
