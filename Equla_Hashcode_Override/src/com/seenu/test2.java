package com.seenu;

public class test2 {
	int id;
	public test2(int id) {
		this.id = id;
	}
	@Override
	public boolean equals(Object obj) {
		if(this==obj)
			return true;
		test2 t = (test2)obj;
		return t.id==this.id;
	}
	
	@Override
	public int hashCode() {
		return this.id;
	}
	public static void main(String[] args) {
		test2 t1 = new test2(123);
		test2 t2 = new test2(234);
		if(t1.hashCode()==t2.hashCode()) {
			if(t1.equals(t2)) {
				System.out.println("both obj equals");
			}else {
				System.out.println("not equal");
			}
		}
		System.out.println("equalllllllllllll");
		}
	}
