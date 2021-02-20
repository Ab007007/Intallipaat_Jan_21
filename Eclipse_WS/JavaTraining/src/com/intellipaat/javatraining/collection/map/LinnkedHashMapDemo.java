package com.intellipaat.javatraining.collection.map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinnkedHashMapDemo {
	
	public static void main(String[] args) {
		
		Map mp = new LinkedHashMap();
		mp.put("Name", "Aravind");
		mp.put("Age",30);
		mp.put("Place","India");

		
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
