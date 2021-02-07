package com.intellipaat.javatraining.as.pack1;

public class A {

	private int privateVariable = 10;
	int defaultValue = 20;
	protected int protectedVariable = 30;
	public int publicVariable = 40;
	
	private void test1()
	{
		System.out.println("Private method");
	}
	
	void test2()
	{
		System.out.println("Default method");
	}
	
	protected void test3()
	{
		System.out.println("Protected method");
	}
	
	public  void test4()
	{
		System.out.println("Public method");
	}



	public static void main(String[] args) {
		
		A a = new A();
		System.out.println(a.privateVariable);
		System.out.println(a.defaultValue);
		System.out.println(a.protectedVariable);
		System.out.println(a.publicVariable);
		
		a.test1();
		a.test2();
		a.test3();
		a.test4();
	}

}
