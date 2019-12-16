package com.seenu.Lambda_Expression;

interface A {
	public String m1();
}
public class Zero_param {
	public static void main(String[] args) {
		A a = ()->{ 
			return "hi....Zero param Executed";
			};
		System.out.println(a.m1());
	}
}
