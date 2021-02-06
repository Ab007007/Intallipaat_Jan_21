package com.intellipaat.javatraining.variables;


public class VariablesDemo {

	/*
	 * Variables
	 * Methods
	 * Constructor
	 * SIB
	 * IIB
	 * 
	 */
	
	final static String org = "IBM";
	String name  ;
	int age;
	
	public static void main(String[] args) 
	{
		int i = 100;
		VariablesDemo vd1 = new VariablesDemo();
		VariablesDemo vd2 = new VariablesDemo();
		vd1.name = "ARavinda";
		vd1.age = 35;
		//vd1.org = "WIPRO";
		vd2.name = "XYZ";
		vd2.age = 55;
		vd1.name = "Aravinda";
		System.out.println(vd1.name);
		System.out.println(vd1.age);
		System.out.println(vd1.org);
		System.out.println(vd2.name);
		System.out.println(vd2.age);
		System.out.println(vd2.org);
		
		
	}
	
	
}