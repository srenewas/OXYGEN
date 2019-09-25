package com.seenu;

import java.util.Scanner;

public class calculator2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The X Values....");
		double x = sc.nextDouble();
		System.out.print("Enter The Y Values....");
		double y = sc.nextDouble();
		System.out.print("Enter Your Operator...");
		char ch = sc.next().charAt(0);
		double z;
		switch(ch) {
		
		case '+': z=x+y;
		break;
		
		case '-': z=x-y;
		break;
		
		case '/': z=x/y;
		break;
		
		case '*': z=x*y;
		break;
		
		default:
			System.out.println("ERROR...PLEASE ENTER VALID KEYWORDS");
			return;
		}
		System.out.println("And Your Result Is....."+x+ch+y+"="+z);
	}

}
