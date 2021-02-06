package com.intellipaat.javatraining.methods;

public class PolymorphismDemo {

	public static void main(String[] args) {
		int a=10 , b=20;
		
		PolymorphismDemo md = new PolymorphismDemo();
		
		md.sum(10,20);
		
		md.sum(22.5, 33.5);
		
		md.sum(5, 55.5);
		
	}
	/*
	 * [a
	 * 
	 * 
	 */
	void sum(int a , int b)
	{
		System.out.println("Sum of Two numbers is : " + (a+b));
	}
	
	
	void sum(double a ,double b)
	{
		System.out.println("Sum of Two numbers " + a + " and " + b + " is "  + (a+b));
	}
	
}
