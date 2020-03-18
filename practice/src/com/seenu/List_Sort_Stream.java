package com.seenu;

import java.util.ArrayList;
import java.util.List;

public class List_Sort_Stream {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(123);
		list.add(450);
		list.add(163);
		list.add(178);
		list.add(111);
		list.stream().sorted().forEach(System.out::println);
	}
}
