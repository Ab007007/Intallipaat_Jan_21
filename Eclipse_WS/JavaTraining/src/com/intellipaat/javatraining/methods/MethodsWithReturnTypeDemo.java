package com.intellipaat.javatraining.methods;

public class MethodsWithReturnTypeDemo {

	public static void main(String[] args) {
		MethodsWithReturnTypeDemo md = new MethodsWithReturnTypeDemo();
		
		int c = md.sum(10,20);
		System.out.println("Printing value of c in main method " + c);
		c= md.sum(100,c);
		System.out.println("Printing value of c in main method " + c);
		c = md.sum(10,c);
		System.out.println("Printing value of c in main method " + c);
		c = md.sum(10,c);
		System.out.println("Printing value of c in main method " + c);
		md.printMyName();
		
		
	}
	/*
	 * [a
	 * 
	 * 
	 */
	void printMyName()
	{
		System.out.println("I'm a Programmer");
	}
	int sum(int a , int b)
	{
		int d  = a+b;
		System.out.println(a + " + " + b + " = " + d);
		return d;
	}
	
}
