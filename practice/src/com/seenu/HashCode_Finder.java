package com.seenu;

import java.util.Scanner;

public class HashCode_Finder {
	public static void main(String[] args) {
		System.out.println("**************ENTER THE VALUE FOR HASHCODE***********");
		Scanner sc = new Scanner(System.in);
		while(true) {
			 String s = sc.next();
             int hash = s.hashCode();
             System.out.println(hash);
		}
	}
}
