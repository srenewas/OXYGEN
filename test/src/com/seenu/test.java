package com.seenu;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map.Entry;

public class test {
	public static void main(String[] args) {
		Hashtable<Integer, String> ht = new Hashtable<>();
		ht.put(123, "seenu");
		ht.put(143, "akhil");
		ht.put(563, "suvva");
		ht.put(83, "bugga");
		ArrayList<Entry<Integer, String>> al = new ArrayList<Entry<Integer,String>>(ht.entrySet());
		al.stream().sorted().forEach(System.out::println);
	}
}
