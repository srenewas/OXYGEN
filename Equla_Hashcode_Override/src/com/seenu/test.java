package com.seenu;

class equals_hashcode{
	public String name;
	public int id;
	public equals_hashcode(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	//HERE WE OVERRIDE THE EQUALS METHOD*******************************************
	@Override
	public boolean equals(Object obj) {
		if(this==obj)
			return true;
		if(obj==null||obj.getClass()!=this.getClass())
			return false;
		equals_hashcode code = (equals_hashcode) obj;
		return (code.name==this.name&&code.id==this.id);
	}
	//HERE WE OVERRIDE THE HASHCODE METHOD*******************************************
	@Override
	public int hashCode() {
		return this.id;
	}
}
public class test {
	public static void main(String[] args) {
		equals_hashcode ref1 = new equals_hashcode("seenu", 101);
		equals_hashcode ref2 = new equals_hashcode("suhas", 202);
		if(ref1.hashCode()==ref2.hashCode()) {
			if(ref1.equals(ref2)) {
				System.out.println("both objects are equal.......");
			}else {
				System.out.println("not equal");
			}
		}else {
			System.out.println("both the obj are equa++++");
		}
	}
}
