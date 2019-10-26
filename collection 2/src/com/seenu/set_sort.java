package com.seenu;

import java.util.HashSet;
import java.util.TreeSet;

public class set_sort {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		set.add("seenu");
		set.add("akhil");
		set.add("suvvy");
		set.add("bugga");
		TreeSet<String> tree = new TreeSet<>(set);
		System.out.println(tree);
	}

}
