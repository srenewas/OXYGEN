package com.seenu;

import java.util.Scanner;

public class Vowel_Count {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("************ENTER YOUR WORD***********");
		String s = sc.nextLine();
		char[] ch = s.toCharArray();
		int count = 0;
		for(char c :ch) {
			switch(c) {
			case 'A':case 'a':
			case 'E':case 'e':
			case 'I':case 'i':
			case 'O':case 'o':
			case 'U':case 'u':
				count++;
				break;
			}
		}
		System.out.println("NUMBER OF VOWELS ARE -------> "+count);
	}

}
