package com.seenu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

public class test {
	public static void main(String[] args) {
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		ht.put(101, "seenu");
		ht.put(102, "vasu");
		ht.put(103, "bugga");
		ht.put(105, "mini");
		ArrayList<Entry<Integer,String>> list = new ArrayList<>(ht.entrySet());
		Collections.sort(list,new Comparator<Map.Entry<Integer,String>>() {
			
			@Override
			public int compare(Entry<Integer,String> o1, Entry<Integer,String> o2) {
				return o1.getValue().compareToIgnoreCase(o2.getValue());
			}
		});
		for(Entry<Integer,String> ss : list) {
			System.out.println(ss);
		}
	}

}
