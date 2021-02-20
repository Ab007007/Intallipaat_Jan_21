package com.intellipaat.javatraining.collection.set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	
	public static void main(String[] args) 
	{
		Set hs = new TreeSet();
		
		hs.add(253);
		hs.add(200);
		hs.add(2000);
		hs.add(1);
		
		printSet(hs);
		System.out.println("--- Inserting 2 elements one is duplicate ---");
		hs.add(3232);

		printSet(hs);;
		System.out.println("--- Removing 1 element ---");
		hs.remove(1);
		printSet(hs);
		
	}

	private static void printUsingIterator(Set hs) {
		Iterator it = hs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}
	}

	private static void printSet(Set hs) {
		System.out.println("--------------------------------------------------");
		System.out.println("Total Size " + hs.size());

		for (Object object : hs) {
			System.out.println(object);
		}
		System.out.println("--------------------------------------------------");

	}

}
