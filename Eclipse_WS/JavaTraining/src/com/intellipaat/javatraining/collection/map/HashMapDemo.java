package com.intellipaat.javatraining.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
	
	public static void main(String[] args) {
		
		Map mp = new HashMap();
		mp.put("Name", "Aravind");
		mp.put("Age",30);
		mp.put("Place","India");

		
		System.out.println("Size " + mp.size());
		
		printMapElements(mp);
		
	}

	private static void printMapElements(Map mp) {
		System.out.println("--- Printing size " + mp.size());
		Set keys = mp.keySet();
		
		Iterator it = keys.iterator();
		
		while(it.hasNext())
		{
			String key = (String)it.next();
			System.out.println(mp.get(key));
		}
	}

}
