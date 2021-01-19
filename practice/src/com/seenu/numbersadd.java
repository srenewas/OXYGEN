package com.seenu;

import java.util.Scanner;

public class numbersadd {
	public static int message(int n) {
		int result = 0;
		while(n/10>0) {
			result += n%10;
			n=n/10;
		}
		return result+n%10;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE DATA.....");
		System.out.println(message(sc.nextInt()));
	}
}
