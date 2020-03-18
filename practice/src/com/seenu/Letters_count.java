package com.seenu;

public class Letters_count {
	public static void main(String[] args) {
		String s = "seenu";
		int count = 0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=0)
				count++;
		}
		System.out.println(count);
	}
}
