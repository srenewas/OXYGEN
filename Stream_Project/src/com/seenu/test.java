package com.seenu;

import java.util.List;
import java.util.stream.Collectors;

public class test {
	public static List<Employee> result(){
		return Database.getEmployee().stream().filter(x->x.getSalary()>50000).collect(Collectors.toList());
	}
	public static void main(String[] args) {
		System.out.println(result());
	}
}
