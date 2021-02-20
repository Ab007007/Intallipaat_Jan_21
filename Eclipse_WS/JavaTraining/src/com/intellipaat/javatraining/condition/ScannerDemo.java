package com.intellipaat.javatraining.condition;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args)
	{
		System.out.println("---Generate Table ----");
		Scanner sc = new Scanner(System.in);
		String choice;
		do {
			System.out.println("--- Please enter the number ---");
			int num = sc.nextInt();
			
			System.out.println("--- Generating table for " + num);
			for (int i = 1; i <=10;i++) {
				System.out.println(num + " * " + i + " = " + (num*i));
			}
			
			System.out.println("---Do you want to continue ???? yes/no");
			choice = sc.next();
			
		}while(choice.equalsIgnoreCase("yes"));
		
		
	}
}
