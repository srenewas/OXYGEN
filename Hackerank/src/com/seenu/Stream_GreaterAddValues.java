package com.seenu;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Stream_GreaterAddValues {
	public static void main(String[] args) {
		List<Integer> list  = Arrays.asList(11,4,23,6,89,0,9);
		int sum= list.stream().filter(i->i>10).mapToInt(i->i).sum();
		System.out.println(sum);
	}

}
