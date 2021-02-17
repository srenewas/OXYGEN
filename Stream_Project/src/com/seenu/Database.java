package com.seenu;

import java.util.ArrayList;
import java.util.List;

public class Database {
	public static List<Employee> getEmployee(){
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(101, "seenu", "capgemini", 70000));
		list.add(new Employee(201, "suhas", "google", 20000));
		list.add(new Employee(301, "aron", "cts", 60000));
		list.add(new Employee(401, "mini", "hcl", 100000));
		list.add(new Employee(501, "akhil", "hp", 10000));
		list.add(new Employee(601, "anupam", "genpact", 30000));
		return list;
	}

}
