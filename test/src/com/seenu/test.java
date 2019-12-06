package com.seenu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.StringTokenizer;

class test{
	public static void main(String[] args) {
		int[] a = {7,3,1,9,0,0,3,2,1,7,7,7,3,0};
		Set<Integer> set = new HashSet(Arrays.asList(a));
		set.add(123);
		System.out.println(set);
	}
	}
