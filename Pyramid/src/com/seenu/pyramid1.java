package com.seenu;

public class pyramid1 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);  // it will print like  : 112123123412345
			}
			System.out.println();   // USED TO PRINT THE VALUES IN NEXT LINE
		}
	}
}
