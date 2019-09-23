package com.collection.map;

import java.util.HashMap;
import java.util.Map.Entry;

public class test {
	public static void main(String[] args) {
		HashMap<Employee,Student> map = new HashMap<>();
		map.put(new Employee(101, "seenu"), new Student(1, "suhas"));
		map.put(new Employee(112, "mini"), new Student(1, "aron"));
		map.put(new Employee(110, "rag"), new Student(1, "bugga"));
		map.put(new Employee(222, "mammu"), new Student(1, "suvva"));
		
		for(Employee emp :map.keySet()) {
			System.out.println(emp.eid+" "+ emp.name);                         //THIS WILL PRINT KEYS OF ELEMENTS ONLY
		}
		
		for(Student s:map.values()) {
			System.out.println(s.sid+" "+s.name);                              //THIS WILL PRINT VALUES OF ELEMENTS ONLY
		}
		
		for(Entry<Employee, Student> entry :map.entrySet()) {
			System.out.println(entry.getKey()+"        "+ entry.getValue());   //THIS WILL PRINT ALL KEY AND VALUES
		}
	}
}
