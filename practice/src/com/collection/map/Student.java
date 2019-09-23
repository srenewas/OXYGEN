package com.collection.map;

public class Student {
	int sid;
	String name;
	public Student(int sid, String name) {
		super();
		this.sid = sid;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + "]";
	}
	
}
