package com.seenu;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap_Sort {
	public static void main(String[] args) {
		TreeMap tm = new TreeMap(new MyComp());
		tm.put(102, "seenu");
		tm.put(110, "buggy");
		tm.put(103, "minion");
		System.out.println(tm);
	}
}
//class MyComp implements Comparator<Integer>{
//	@Override
//	public int compare(Integer i1, Integer i2) {
//		return -i1.compareTo(i2);
//	}
//	
//}

class MyComp implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		return s1.compareTo(s2);
	}
	
}
