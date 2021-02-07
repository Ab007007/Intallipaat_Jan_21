package com.intellipaat.javatraining.inheritance;

public class Cow extends Animal
{
		
	void resident()
	{
		System.out.println(" Resides in Village House");
	}
	
	
	public static void main(String[] args) {
		Cow c  = new Cow();
		
		c.see();
		c.eat();
		c.resident();
	}
	
	
}
