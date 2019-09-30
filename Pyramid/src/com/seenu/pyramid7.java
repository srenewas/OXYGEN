package com.seenu;

import java.util.Scanner;

public class pyramid7 {
	public static void main(String[] args) {
		int num,k=1;
		System.out.println("|||||******Enter Your Value******|||||");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++,k++) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}
}
