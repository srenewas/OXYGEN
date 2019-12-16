package com.seenu.Lambda_Expression;

interface B{
	public String name(String s1);
}
public class Single_param {
	public static void main(String[] args) {
		B b = (s1)->{
		return "Hello "+s1;		
		};
		System.out.println(b.name("Seenu"));
	}

}
