package com.seenu;

public class pyramid3 {
	public static void main(String[] args) {
		
		int odd=1;
		for(int i=1;i<=5;i++) {
			int k=0;
			for(int j=1;j<=odd;j++) {
				if(j<=i) {
					k=k+1;
				}else {
					k=k-1;
				}
				System.out.print(k+" ");
			}
			System.out.println();   // USED TO PRINT THE VALUES IN NEXT LINE
			odd=odd+2;
		}
	}
}
