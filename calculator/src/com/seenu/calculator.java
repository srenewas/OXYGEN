package com.seenu;

import java.util.Scanner;

public class calculator {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("ENTER X VALUE.........");
		int x = s.nextInt();
		System.out.println("ENTER Y VALUE...");
		int y = s.nextInt();
		int z = x+y;
		System.out.println("AND THE VALUE IS......"+z);
	}

}
