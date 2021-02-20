package com.intellipaat.javatraining.strings;

public class StringFunctionsDemo {
	
	public static void main(String[] args) {
		
		String str = "aru03.info@gmail.com";
		
		System.out.println("Char at 0th index " + str.charAt(0));
		System.out.println("Char at 4th index " + str.charAt(4));
		
		System.out.println("Length of the String " + str.length());
		
		System.out.println("Index of a char " + str.indexOf("03"));
		
		System.out.println("Sub string from 5th index " + str.substring(5));
		
		System.out.println(" User Name form email " + 
		str.subSequence(0, str.indexOf("@")));
		
		System.out.println("--- SPLIT ---");
		
		String[] words = str.split("@");
		
		System.out.println(words[0]);
		System.out.println(words[1].substring(0,words[1].indexOf(".")));
		
		
		
		
	}

}
