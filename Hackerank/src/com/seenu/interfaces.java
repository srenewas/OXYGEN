package com.seenu;

interface fruit{
	String str  = "Mango";
}
class Myfruit implements fruit{
}
public class interfaces {
     public static void main(String[] args) {
	    System.out.println(Myfruit.str);
}
}
