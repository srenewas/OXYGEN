package com.seenu;

public class CatchPool {
	public static void main(String[] args) {
		Integer i1 = 127;
		Integer i2 = 127;
		System.out.println(i1==i2);
		Integer i3 = 128;
		Integer i4 = 128;
		System.out.println(i3==i4);  //A 128-bit register can store 2128 (over 3.40 × 1038) different values. 
		                             //The range of integer values that can be stored in 128 bits depends on the integer representation used.
		Integer i5 = 125;
		Integer i6 = 125;
		System.out.println(i5==i6);
	}

}
