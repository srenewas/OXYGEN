package com.seenu;

import java.util.SortedMap;
import java.util.TreeMap;

public class test3 {
	public static void main(String[] args) {
		TreeMap<Integer, String> t = new TreeMap<Integer,String>();
		t.put(10,"ratan");
		t.put(20,"anu");
		t.put(5,"durga");
		t.put(3,"sunny");
		System.out.println(t);
//		SortedMap<Integer, String> sm = t.subMap(5, 20);
//		TreeMap<Integer, String> tt = new TreeMap<Integer,String>(sm);
//		System.out.println(tt);
	}

}
