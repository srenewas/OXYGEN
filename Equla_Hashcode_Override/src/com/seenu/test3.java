package com.seenu;

public class test3 {
	String name;
	int id;
	public test3(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
   @Override
   public boolean equals(Object obj) {
	   if(this==obj) {
		   return true;
	   }
	   if(obj==null||obj.getClass()!=this.getClass()) {
		   return false;
	   }
	   test3 d = (test3)obj;
	   return d.name==this.name&&d.id==this.id;
   }
   @Override
   public int hashCode() {
	return id;
   }
	public static void main(String[] args) {
		test3 d1 = new test3("seenu", 101);
		test3 d2 = new test3("senu", 101);
		if(d1.hashCode()==d2.hashCode()) {
			System.out.println("both the objects hashcode values are equals");
		}else{
			System.out.println("not equals");
		}
		if(d1.equals(d2)) {
			System.out.println("both the objects equals are equals");
		}else {
			System.out.println("not equals");
		}
     }
}