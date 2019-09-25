package com.seenu;

public class pyramid5 {
	public static void main(String[] args) {
		
		int a=1;
		for(int i=1;i<=10;i++) {
			for(int l=10;l>=i;l--) {
				System.out.print("  ");
			}
			int k=0;
			for(int j=1;j<=a;j++) {
				if(j<=i) {
					k=k+1;
				}else {
					k=k-1;
				}
				System.out.print(k+" ");
			}
			System.out.println();
			a=a+2;
		}
	}
}
