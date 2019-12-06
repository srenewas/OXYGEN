package com.seenu;

class Xyz{
	private static Xyz obj = new Xyz();
	private Xyz() {
		System.out.println("instance eager");
	}
	public static Xyz getInstance() {
		return obj;
	}
}
public class Singleton_Eag_load {
	public static void main(String[] args) {
		Xyz obj = Xyz.getInstance();
		Xyz obj2 = Xyz.getInstance();
	}
}
