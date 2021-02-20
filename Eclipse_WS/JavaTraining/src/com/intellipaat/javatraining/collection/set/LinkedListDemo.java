package com.intellipaat.javatraining.collection.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedListDemo {
	
	public static void main(String[] args) 
	{
		Set hs = new LinkedHashSet();
		
		hs.add("acd");
		hs.add(25.5);
		hs.add(25);
		hs.add("abcd");
		hs.add("acd");
		hs.add(25.5);
		hs.add(25);
		hs.add("abcd");
		
		printSet(hs);
		System.out.println("--- Inserting 2 elements one is duplicate ---");
		hs.add("acd");
		hs.add(3232);

		printSet(hs);;
		System.out.println("--- Removing 1 element ---");
		hs.remove(25.5);
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
