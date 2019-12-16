package com.seenu.Lambda_Expression;

import java.util.ArrayList;

public class Collection_ForEachLoop {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("seenu");
		list.add("vasu");
		list.add("suvvy");
		list.forEach((n)-> System.out.println(n)); // You Can Pass Param as Any Letter
	}
}
