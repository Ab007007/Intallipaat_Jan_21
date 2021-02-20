package com.intellipaat.javatraining.exceptions;

public class ExceptionDemo {

	
	public static void main(String[] args) {
		System.out.println("--- main started ---");
		test1();
		System.out.println("--- main ended ---");
	}
	
	public static void test1() {
		String str = null;
		System.out.println(str.length());	
	}
}
