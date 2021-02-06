package com.intellipaat.javatraining.methods;

public class MethodsDemo {

	public static void main(String[] args) {
		int a=10 , b=20;
		
		MethodsDemo md = new MethodsDemo();
		
		md.sum(10,20);
		md.sum(100,20);
		md.sum(10,200);
		md.sum(10,240);
		md.sum(140,20);
		md.sum(150,20);
		md.sum(10,202);
		
		
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
	
}
