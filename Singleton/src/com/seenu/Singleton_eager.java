package com.seenu;

public class Singleton_eager {
	
	private Singleton_eager() {
	}
	private static Singleton_eager instance = new Singleton_eager();
	private static Singleton_eager getinstance() {
		return instance;
	}
	public static void main(String[] args) {
		Singleton_eager reference = Singleton_eager.getinstance();
		System.out.println("hashcode value is :"+reference);
		
		Singleton_eager reference2 = Singleton_eager.getinstance();
		System.out.println("hashcode value is :"+reference2);

		System.out.println(reference==reference2);

	}
}
