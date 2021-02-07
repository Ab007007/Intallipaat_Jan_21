package com.intellipaat.javatraining.constructor;

public class Person {
	
	private String name;
	private int age;
	
	public Person() {
		System.out.println("Constructor Called..");
	
	}
	
	public Person(String name,  int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public static void main(String[] args) {
		
		Person p = new Person();
		
		p.name = "Aravinda";
		p.age = 35;
		System.out.println(p.name);
		System.out.println(p.age);
		
		
		Person p2 = new Person("AHB",40);
		System.out.println(p2.name);
		System.out.println(p2.age);
		
		Person p3 = new Person("AHB123",40);
		System.out.println(p3.name);
		System.out.println(p3.age);
	}
	

}
