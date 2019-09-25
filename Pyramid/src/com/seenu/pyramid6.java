package com.seenu;

import java.util.Scanner;

public class pyramid6 {
	public static void main(String args[]) 
	 {
	  Scanner sc = new Scanner(System.in);
	  System.out.print("Enter the number of terms: ");
	
	  int n = sc.nextInt();
	  int s = 0, i;                       // s for terms of series, c for counter to generate n terms
	  for (i = 1; i <= n; i++) {
	   s = s * 10 + i;
	   System.out.print(s + " ");
	  }
	 }
}
