package com.intellipaat.javatraining.collection.map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
	
	public static void main(String[] args) {
		
		Map mp = new TreeMap();
		
		mp.put("State","Karnataka");
		mp.put("Country","India");
		mp.put("Name", "Aravind");
		
		System.out.println("Size " + mp.size());
		
		printMapElements(mp);
		if(!mp.containsKey("Place"))
		{
			mp.put("Place","BANGALORE");
		}
		
		printMapElements(mp);
		
	}

	private static void printMapElements(Map mp) {
		System.out.println("--- Printing size " + mp.size());
		Set keys = mp.keySet();
		
		Iterator it = keys.iterator();
		
		while(it.hasNext())
		{
			String key = (String)it.next();
			System.out.println(key + " - " + mp.get(key));
		}
	}

}
