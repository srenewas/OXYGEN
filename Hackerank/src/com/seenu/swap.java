package com.seenu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class swap {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("seenu");
		list.add("suhas");
		list.add("anupama");
		list.add("akhil");
		List<String> li = list.stream().sorted().collect(Collectors.toList());
		System.out.println(li);
		
		List<String> l = Arrays.asList("s","a","g","n","r");
		l.stream().map(x-> x.toUpperCase()).forEach(System.out::println);
		
		List<String> list3 = Arrays.asList("1","3","67","8","4");
		list3.stream()
		.map(z->Integer.valueOf(z))
		.filter(x-> x%2==0)
		.forEach(x-> System.out.println(x));
		
		List<Integer> list4 = Arrays.asList(1,45,23,8,10);
		int c1 = list4.stream().min((i1,i2)->i1.compareTo(i2)).get();
		int c2 = list4.stream().max((i1,i2)->i1.compareTo(i2)).get();
		System.out.println(c1);
		System.out.println(c2);
		
		List<String> list5 = Arrays.asList("seenu","suhas","raviu","Akhil");
		String s = list5.stream().sorted(Collections.reverseOrder()).findFirst().get();
		System.out.println(s);
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("seenu", 123);
		map.put("vasu", 786);
		map.put("aron", 45);
		List<Entry<String, Integer>> ll = new ArrayList<>(map.entrySet());
		ll.stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		
		
		
    }
	}
