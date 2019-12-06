package com.seenu;

public class Singleton_lazy {
	
	private static Singleton_lazy singleton_instance;
	private String str;
	
	private Singleton_lazy() {
		str=" i am ironman ";
	}
	private static Singleton_lazy getinstance() {
		if(singleton_instance==null) {
			singleton_instance = new Singleton_lazy();
		}
		return singleton_instance;
	}
	public static void main(String[] args) {
		Singleton_lazy obj1 = Singleton_lazy.getinstance();
		Singleton_lazy obj2 = Singleton_lazy.getinstance();
		Singleton_lazy obj3 = Singleton_lazy.getinstance();
		
	//	obj1.str = (obj1.str).toUpperCase(); // here i only modifies the object one only
		
   		System.out.println(obj1.str);   //outpt :  I AM IRONMAN 
   		System.out.println(obj2.str);   //outpt :  I AM IRONMAN 
    	System.out.println(obj3.str);   //outpt :  I AM IRONMAN 


	}
}
