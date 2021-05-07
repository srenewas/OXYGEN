package com.seenu;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class count_occurances {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8));
	    Map<Integer, Integer> Map = list.stream()
	                                    .collect(Collectors.toMap(Function.identity(), x -> 1, Integer::sum));
	    System.out.println(Map);
	}

}
