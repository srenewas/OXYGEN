package com.seenu;

import java.util.Scanner;

public class system_jdk_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Valid Data");
		String data1 = sc.nextLine();
		System.out.println("Enter Same Data");
		String dta2 = sc.next();
		System.out.println(data1);    // input : seenu iglesias here output : seenu iglesias here
		System.out.println(dta2);    //  input : seenu iglesias here output : seenu (next() int will print only one word for particular line)
	}

}
