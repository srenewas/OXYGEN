package com.seenu;

public class Employee implements Comparable<Employee> {
	String name;
	int id;
public Employee(String name,int id) {
	super();
	this.name = name;
	this.id = id;
}
@Override
public int compareTo(Employee e1) {
	return name.compareTo(e1.name);
}

}
