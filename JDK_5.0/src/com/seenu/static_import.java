package com.seenu;
import static java.lang.System.*;

import java.util.Scanner;

public class static_import {
	int a;
	int b;
	int m;
	public static void main(String[] args) {
		out.println("SEENU IGLESIAS");
		Scanner sc = new Scanner(in); // HERE WE ARE NOT USING (System.in) instead of this we use (in) only  
		out.println("enter");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int m = a+b;
		out.println(m);
	}

}


// used to access any static member of a class directly. There is no need to qualify it by the class name.

//Advantage of static import:Less coding is required if you have access any static member of a class oftenly.

//Disadvantage of static import:If you overuse the static import feature, it makes the program unreadable and unmaintainable.
