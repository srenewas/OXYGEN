package com.seenu;

class Calculator{
	public int add(int a ,int b) {return a+b;}
	public int add(int a,int b,int c) {return a+b+c;}
}
public class Method_Overloading {
	public static void main(String[]args) {
		Calculator c = new Calculator();
		System.out.println(c.add(123, 4564));             // Output : 4687
		System.out.println(c.add(234, 55675, 6368387));   // Output : 6424296
	}
}
