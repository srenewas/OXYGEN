package com.seenu;

public class Singleton_lazy_load {
	public static void main(String[] args) {
		Abc obj = Abc.getInstance();
		Abc obj1 = Abc.getInstance();
	}
}
class Abc{
	private static Abc obj;
	private Abc() {
		System.out.println("instance created");
	}
    public static Abc getInstance() {
		if(obj==null) {
			obj=new Abc();
		}
		return obj;
	}
}

