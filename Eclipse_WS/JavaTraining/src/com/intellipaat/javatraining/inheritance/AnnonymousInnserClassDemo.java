package com.intellipaat.javatraining.inheritance;

public class AnnonymousInnserClassDemo {

	
	
	public static void main(String[] args) {
		Carnivorous c = new Carnivorous()
		{
			
			@Override
			public void flesheater() {
				System.out.println("annonymous flesheater");
				
			}
			
			@Override
			public void attackingStyle() {
				System.out.println("Annonymour attacking Style");
			}
		};
		
		
		c.flesheater();
		c.attackingStyle();
	}
}
