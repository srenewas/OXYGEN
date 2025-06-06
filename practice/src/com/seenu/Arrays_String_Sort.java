package com.seenu;

import java.util.*;
import java.lang.*;
import java.io.*;

class Arrays_String_Sort{
	public static void test() {
		String[] a = {"ZZZZ", "GGG", "BB", "KKKK"};
		// Sort alphabetically
		Arrays.sort(a);
		// Print sorted array
		for (String s : a) {
			System.out.println(s);
		}
	}
	public static void test2() {
		String[] a = {"ZZZZ", "GGG", "BB", "KKKK"};
		// Sort alphabetically
		Arrays.sort(a,Collections.reverseOrder());
		// Print sorted array
		for (String s : a) {
			System.out.println(s);
		}
	}
	public static void test3() {
		String[] arr = {"sahil", "bajaj", "test", "acke"};
		Map<String, String> map = new TreeMap<String, String>();
        for (String s : arr) {
            map.put(s, "for test");
        }
		for (Map.Entry<String, String> entry : map.entrySet()){
			System.out.println(entry.getKey());
		}
	}
	public static void main (String[] args) throws java.lang.Exception{
		test();
		System.out.println("\n");
		test2();
		System.out.println("\n");
		test3();
    }
}