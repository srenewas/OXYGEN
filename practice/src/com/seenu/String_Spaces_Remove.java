package com.seenu;

public class String_Spaces_Remove {
	public static void main(String[] args) {
		String s = "Seenu Miquel Iglesias Preysler";
		System.out.println(s.replaceAll("S", "P"));
		System.out.println(s.replaceAll(" ", ""));  //SeenuMiquelIglesiasPreysler
	}
}
