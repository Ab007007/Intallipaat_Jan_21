package com.intellipaat.javatraining.condition;

public class IfElseDemo {

	public static void main(String[] args) {

		System.out.println("--- main started ---");

		int a = 10;
		int b = 10;

		if (a > b) {
			System.out.println("A is greater");
		} else if (b > a) {
			System.out.println("B is greater");
		} else {
			System.out.println("A and B are equal");
		}

		System.out.println("--- main ended ---");
	}
}
