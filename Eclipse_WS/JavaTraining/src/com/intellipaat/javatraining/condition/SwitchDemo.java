package com.intellipaat.javatraining.condition;

public class SwitchDemo {

	public static void main(String[] args) {
		String choice = null;

		choice = "B";
		switch (choice) {
		case "A":
			System.out.println("Marks of a student is more than 90%");
			break;
		case "B":
			System.out.println("Marks of a student is more than 70%");
			break;
		case "C":
			System.out.println("Marks of a student is more than 50%");
			break;

		default:
			System.out.println("Please check ur choice!!!");
			break;
		}
	}

}
