
package com.seenu;

import java.util.Arrays;
import java.util.List;

public class Stream_Match {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(12,4,6,9,56,34,11);
		
		Boolean isanymatch= list.stream().anyMatch(x->x>10);
		System.out.println(isanymatch);
		
		Boolean isnonematch = list.stream().noneMatch(x->x<10);
		System.out.println(isnonematch);
		
		Boolean isallmatch = list.stream().allMatch(x->x>12);
		System.out.println(isallmatch);
	}

}
