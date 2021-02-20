package com.intellipaat.javatraining.exceptions;

import java.util.Scanner;

public class ThrowDemo {
	
	public static void main(String[] args) 
	{
		int balance = 5000;
		String choice;
		int tempBalance;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("--- Enter the amount to withdraw");
			int amount = sc.nextInt();
			
			tempBalance = balance - amount;
			
			if(tempBalance<=0)
			{
				try 
				{
					throw new Exception();
				} catch (Exception e) 
				{
					System.out.println("Exception while perfoming withdraw, your"
							+ "balance is too low!!!, you have " + balance);
				}
				finally {
					System.out.println("finally  Executing!!!!");
				}
			}
			else {
				balance = tempBalance;
				System.out.println("--- Your current balance is --> " + balance);
				
			}
			
			System.out.println("Do you want to continue ??? yes/no ???");
			choice = sc.next();
		}while(choice.equalsIgnoreCase("yes"));
		
		System.out.println("Thank you!!!");
	}

}
