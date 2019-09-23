package com.seenu;

import java.util.SortedMap;
import java.util.TreeMap;

public class test4 {
	public static void main(String[] args) {
		TreeMap<String,Integer> t = new TreeMap<String,Integer>();
		t.put("ratan",100);
		t.put("anu",112);
		t.put("durga",113);
		t.put("sunny",110);
		System.out.println(t);
//		SortedMap<Integer, String> sm = t.subMap(5, 20);
//		TreeMap<Integer, String> tt = new TreeMap<Integer,String>(sm);
//		System.out.println(tt);
	}

}
