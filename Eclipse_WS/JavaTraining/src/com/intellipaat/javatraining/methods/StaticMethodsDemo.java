package com.intellipaat.javatraining.methods;

public class StaticMethodsDemo {

	public static void main(String[] args) {
		int a=10 , b=20;
		
	
		sum(10,20);
		sum(100,20);
		sum(10,200);
		sum(10,240);
		sum(140,20);
		sum(150,20);
		sum(10,202);
		
		
	}
	/*
	 * [a
	 * 
	 * 
	 */
	static void sum(int a , int b)
	{
		System.out.println("Sum of Two numbers is : " + (a+b));
	}
	
}
