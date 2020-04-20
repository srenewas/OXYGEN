package com.seenu;

import java.util.ArrayList;
import java.util.Collections;

public class test {
	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee("ravi", 101));
		al.add(new Employee("akhila", 102));
		
//		Collections.sort(al);                             // it prints ascending order list    (default)
		Collections.sort(al,Collections.reverseOrder());  // it prints descending order list
		
		for(Employee emp:al) {
			System.out.println("EMPLOYEE ID   :"+emp.id);
			System.out.println("EMPLOYEE NAME :"+emp.name);
		}
		
	}

}
