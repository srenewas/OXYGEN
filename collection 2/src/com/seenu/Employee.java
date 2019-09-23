package com.seenu;

import java.util.ArrayList;
import java.util.Collections;

public class Employee {
	int id;
	String name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
public static void main(String[] args) {
	ArrayList<Employee> employee = new ArrayList<>();
	employee.add(new Employee(120,"suvvy"));
	employee .add(new Employee(102, "seenu"));
	Collections.sort(employee,new comparator2());
	for(Employee emp:employee) {
		System.out.println(emp.id+" "+emp.name);
	}
}
}
