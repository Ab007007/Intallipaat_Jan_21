package com.intellipaat.javatraining.ib;

public class StaticBlockDemo {

	
	static
	{
		System.out.println("I'm executing now....");
	}
	
	static int count = 0;
	
	
	{
		System.out.println("instance block : " + ++count);
	}
	
	
	public StaticBlockDemo() {
		System.out.println("Constructor called");
	
	}
	
	public static void main(String[] args) {
		System.out.println("main loaded for execution");
		StaticBlockDemo sb1 = new StaticBlockDemo();
		StaticBlockDemo sb2 = new StaticBlockDemo();
		StaticBlockDemo sb3 = new StaticBlockDemo();
		StaticBlockDemo sb4 = new StaticBlockDemo();
		
		
		
		
		
	}
}
