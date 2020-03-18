package com.seenu;

import java.util.Scanner;

public class Calculator_Infinite_Addition {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int sum=0;
		System.out.println("ENTER THE CHAR");
		while (true) {
			int x = sc.nextInt();
			if(x==0)
				break;
			sum += x;
			System.out.println("-------------> "+sum);       // IF U WANT TO FOR EVERY ADDITION 
		}
		System.out.println("sum in the end : "+sum);       // IF YOU WANT TOTAL SUM YOU HAVE TO ENTER 0 AT THE END
	}
}
