package com.intellipaat.javatraining.inheritance;

public class Tiger extends Animal implements Carnivorous
{
	
	void resident()
	{
		System.out.println("Thick Forest or Zoo");
	}
	
	
	void eat() {
		System.out.println("Tiger eat flesh and animals");
	}
	public static void main(String[] args) {
		Tiger t = new Tiger();
		t.see();
		t.eat();
		t.resident();
		t.flesheater();
		t.attackingStyle();
	}


	@Override
	public void flesheater() {
		System.out.println("Eats all type of birds and animals");
	}


	@Override
	public void attackingStyle() {
		System.out.println("Tiger attacks very Fast");
	}
}
