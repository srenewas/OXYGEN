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
//	return name.compareTo(e1.name);
	Employee t1 =(Employee)e1;
	if(id==t1.id)
		return 0;
	else if(id>t1.id)
		return 1;
	else
		return-1;
}

}
