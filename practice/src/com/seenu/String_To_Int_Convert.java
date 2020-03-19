package com.seenu;

public class String_To_Int_Convert {
	
	public static int convert(String str) {
		int val=0;
		try {
		val=Integer.parseInt(str);      // 
		}catch(Exception e){
			System.out.println("invalid");
		}
		return val;
	}
	public static void main(String[] args) {
		String str = "1234";
		int i=convert(str);
		System.out.println(i);
		
		str = "12s";
		int j = convert(str);
		System.out.println(j);
	}
}
