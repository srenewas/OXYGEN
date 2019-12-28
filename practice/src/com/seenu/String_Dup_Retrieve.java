package com.seenu;

public class String_Dup_Retrieve {
	public static void main(String[]args) {
		String s = "seenuu";
		char[] ch =s.toCharArray();
		int count = 0;
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<s.length();j++) {
				if(ch[i]==ch[j]) {
					System.out.println(ch[j]);
					count++;
					break;
				}
			}
		}
	}
}
