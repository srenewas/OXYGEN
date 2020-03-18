package com.seenu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class test2 {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(167, "seenuy");
		map.put(123, "revbantgh");
		map.put(17, "zzzzzz");
		
		Comparator<Entry<Integer, String>> sorting = new Comparator<Map.Entry<Integer,String>>() {
			@Override
			public int compare(Entry<Integer, String> o1 ,Entry<Integer, String> o2) {
				return o1.getValue().compareToIgnoreCase(o2.getValue());
			}
		};
		List<Entry<Integer,String>> list = new ArrayList<Map.Entry<Integer,String>>(map.entrySet());
		
		 Collections.sort(list,sorting);          // ONLY LIST CLASS CONTAIN SORTING SO, THATS WHY WE ARE COPY THE ELEMENTS INTO LIST
		 for(Entry<Integer, String> values:list) {
			 System.out.println(values);
		 }
	}
}
