package com.seenu;

public class Demo {
	public static void main(String[] args) {
		String  s = "seenu";
		char[] ch = s.toCharArray();
		for(int i=ch.length-1;i>=0;i--) {
			System.out.println(ch[i]);
		}
	}
}