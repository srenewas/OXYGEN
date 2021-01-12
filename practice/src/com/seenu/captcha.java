package com.seenu;

import java.util.Random;

public class captcha {
	
	static char[] my_password(int len) {
		String alpha = "AQWERTYUIOPLKJHGFDSZXCVBNM";
		String num = "0123456789";
		String values = alpha+num;
		Random rm = new Random();
		char[] ch = new char[len];
		for(int i=0;i<len;i++) {
			ch[i] = values.charAt(rm.nextInt(values.length()));
		}
		return ch;
	}
	public static void main(String[] args) {
		int length=10;
		System.out.print("YOUR PASSWORD IS :");
		System.out.println(my_password(length));
	}
}