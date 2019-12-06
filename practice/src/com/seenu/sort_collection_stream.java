package com.seenu;

import java.util.HashSet;
import java.util.Set;

public class sort_collection_stream {
    public static void main(String[] args) {
    	Set set = new HashSet();
		set.add("seenu");
		set.add("aeron");
		set.add("seenu");
		set.add("bugga");
		set.add("suvva");
		set.stream().sorted().forEach(System.out::println);
	}
}
