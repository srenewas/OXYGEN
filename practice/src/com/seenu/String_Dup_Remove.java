package com.seenu;

import java.util.HashSet;
import java.util.Set;

public class String_Dup_Remove {
	public static void main(String[] args) {
		
		String s= "abbccccdef";
		Set<Character> set = new HashSet<>();   // HERE WE TAKE SET Y BECAUSE ONLY SET DOESN'T ALLOW DUPLICATES
		StringBuffer sf = new StringBuffer();   // FOR OUTPUT
		
		for(int i=0;i<s.length();i++) {
			Character ch = s.charAt(i);        // CONVERT STRING INTO CHARACTER
			if(!set.contains(ch)) {
				set.add(ch);                   // OUTPUT ADD TO SET  LIKE-------> [a, b, c, d, e, f]
				sf.append(ch);                 // FOR PROPER OUTPUT  LIKE-------> abcdef
			}
		}
		System.out.println(set.toString());    // OUTPUT-----> [a, b, c, d, e, f]
		System.out.println(sf.toString());     // OUTPUT-----> abcdef
	}

}
