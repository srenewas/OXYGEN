package com.seenu.Lambda_Expression;

interface calculator{
	public int add(int a,int b);
}
public class Multiple_param {
	public static void main(String[] args) {
		calculator cal = (a,b)->{
			return a+b;
		};
		System.out.println("Total value is :"+cal.add(10, 20));
	}

}
