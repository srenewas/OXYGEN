package com.seenu.Lambda_Expression;

interface calculator2{
	public int multi(int x,int y);
}
public class Multiple_param_without_return {
	public static void main(String[] args) {
		calculator2 c = (x,y)->(x*y);
		System.out.println(c.multi(8, 56));
	}
}
