package com.seenu;

import java.util.ArrayList;
import java.util.List;

public class List_comma_remove {
	public static void main(String[] args) {
		List<Integer> list =  new ArrayList<Integer>();
		list.add(2);
		list.add(4);
		list.add(6);
		list.add(8);
		System.out.println(list);
		StringBuffer sb = new StringBuffer();
		sb.append(list);
		System.out.println(sb.replace(8, 9, " "));
	}
}
