package com.seenu;

public class demo2 {
	public static void main(String[] args) {
		
		for(int i=1;i<=9;i++) {
			for(int k=8;k>=i;k--) {
				System.out.print("");   // FOR SPACES
			}
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
