package com.intellipaat.javatraining.collection.list;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import com.intellipaat.javatraining.constructor.Person;

public class ArrayListDemo {

	public static void main(String[] args) {

		List<Person> al = new ArrayList<Person>();
		
		al.add(new Person());
		al.add(new Person("afa", 12));
		printCollectionValue(al);

		System.out.println("***** Inserting element at 0th Index **********");

		printCollectionValue(al);

		System.out.println("***** Removing element with Value 12  **********");
		for (int i = 0; i < al.size(); i++) {
			if (i == 1 || i == 2) {
				al.remove(i);
			}
		}
		printCollectionValue(al);

	}

	private static void printUsingIterator(List al) {
		System.out.println("--- Print Using Iterator ---");
		Iterator it = al.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

	private static void printUsingForEachLoop(List al) {
		System.out.println("--- Printing using forEach ---");
		for (Object ele : al) {
			System.out.println(ele);
		}
	}

	private static void printCollectionValue(List al) {
		System.out.println("---------------------------------------------");
		System.out.println("Total size of collection is " + al.size());

		for (int i = 0; i < al.size(); i++) {
			System.out.println("index " + i + " --> " + al.get(i));

		}

		System.out.println("---------------------------------------------");
	}

}
