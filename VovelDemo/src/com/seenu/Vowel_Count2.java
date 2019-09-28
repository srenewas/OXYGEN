package com.seenu;

public class Vowel_Count2 {
	public static void main(String[] args) {
		String s = "seenu";
		char[] ch = s.toCharArray();
		int count = 0;
		for(char c : ch) {
			switch(c) {
			case 'a':case 'e':case 'i':case 'o':case 'u':
			case 'A':case 'E':case 'I':case 'O':case 'U':
				count++;
				break;
			}
		}
		System.out.println("OUTPUT : "+count);
	}
}
