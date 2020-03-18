package com.seenu;

import java.util.ArrayList;
import java.util.Collections;

public class Employee {
	int id;
	String name;
	String company;
	public Employee(int id, String name,String company) {
		super();
		this.id = id;
		this.name = name;
		this.company = company;
	}
public static void main(String[] args) {
	ArrayList<Employee> employee = new ArrayList<>();
	employee.add(new Employee(120,"T","Capgemini"));
	employee.add(new Employee(102,"A","Mindtree"));
	employee.add(new Employee(452,"Z","Cognizant"));
	employee.add(new Employee(100,"N","Happiest"));
	employee.add(new Employee(104,"Y","Harman"));
	employee.add(new Employee(106,"E","Accenture"));
	employee.add(new Employee(108,"W","Hindustan uni ltd"));


	Collections.sort(employee,new comparator2());
	for(Employee emp:employee) {
		System.out.println(emp.id+" "+emp.name+" "+emp.company);
	}
}
}
