package com.seenu;

import java.util.ArrayList;

public class Collection_to_Array {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("seenu");
		al.add("akhil");
		al.add("mini");
		al.add("buggy");
		String[] ss = new String[al.size()];
		al.toArray();
		for(String ssss:al) {
			System.out.println(ssss);
		}
	}

}
