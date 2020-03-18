package com.seenu;

import java.util.Comparator;

public class comparator2 implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		//return (e1.name).compareTo(e2.name);
		if(e1.name.compareTo(e2.name)==0) {
			return e1.company.compareTo(e2.company);
		}else {
			return e1.name.compareTo(e2.name);
		}
	}
}
