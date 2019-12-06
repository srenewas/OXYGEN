package com.seenu;

class doublecheck{
	private static doublecheck obj;
	String str;
	private doublecheck() {
		str="new instance created";
	}
	public static doublecheck getinstance() {
		if(obj==null) {
		}
		synchronized (doublecheck.class) {        // here it is the double check locking
		}
		if(obj==null) {
			obj=new doublecheck();
		}
		return obj;
	}
}
public class Lazy_Double_Check {
	public static void main(String[] args) {
		doublecheck check = doublecheck.getinstance();
		doublecheck check1 = doublecheck.getinstance();
		
		check.str = (check.str).toUpperCase();
		
		System.out.println(check.str);
		System.out.println(check1.str);
	}
}
