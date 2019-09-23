package com.seenu;

import java.util.*;
import java.lang.*;
import java.io.*;

class Arrays_String_Sort{
	public static void main (String[] args) throws java.lang.Exception{
		String arr[] = {"sahil", "bajaj", "test", "acke"};
		Map<String, String> map = new TreeMap<String, String>();
		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i], "for test");
}
for (Map.Entry<String, String> entry : map.entrySet()){
	System.out.println(entry.getKey());
       }
    }
}