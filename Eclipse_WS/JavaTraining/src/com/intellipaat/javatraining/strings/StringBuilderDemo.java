package com.intellipaat.javatraining.strings;


public class StringBuilderDemo {

	public static void main(String[] args) {
		
		String str = "aru03.info@gmail.com";
		StringBuilder sb = new StringBuilder(str);
		
		System.out.println(sb);
		System.out.println(sb.hashCode());
		//sb.append(123);
		
		System.out.println(sb);
		System.out.println(sb.hashCode());
		
		
		System.out.println("Char at 0th index " + sb.charAt(0));
		System.out.println("Char at 4th index " + sb.charAt(4));
		
		System.out.println("Length of the sbing " + sb.length());
		
		System.out.println("Index of a char " + sb.indexOf("03"));
		
		System.out.println("Sub sbing from 5th index " + sb.substring(5));
		
		System.out.println(" User Name form email " + 
		sb.subSequence(0, sb.indexOf("@")));
		
		System.out.println("--- SPLIT ---");
		
		
		System.out.println(sb.reverse());
	//	System.out.println(sb.);
		
		
		
		
	}
}
