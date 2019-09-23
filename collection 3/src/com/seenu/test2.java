package com.seenu;

import java.util.TreeMap;

public class test2 {
	public static void main(String[] args) {
		TreeMap tm = new TreeMap(new comp());
		tm.put(101,"seenu");
		tm.put(103,"suvvy");
		tm.put(102,"guvvy");
		tm.put(110,"guggy");
		tm.put(112,"akhil");
		tm.put(123,"mini");
		System.out.println(tm);
	}

}
