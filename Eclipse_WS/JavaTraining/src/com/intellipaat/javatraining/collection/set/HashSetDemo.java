package com.intellipaat.javatraining.collection.set;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.intellipaat.javatraining.constructor.Person;

public class HashSetDemo {
	
	public static void main(String[] args) 
	{
		Set hs = new HashSet();
		
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
