package com.seenu;

import java.util.*;
import java.util.stream.Collectors;

public class remove_duplicates {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8));
	    List<Integer> listWithoutDuplicates = list.stream()
	                                              .distinct()
	                                              .collect(Collectors.toList());
	    System.out.println(listWithoutDuplicates);
	}
}
