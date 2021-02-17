package com.seenu;

import java.util.List;
import java.util.stream.Collectors;

public class test2 {
	public static List<Employee> result2(String input){
		return(input.equalsIgnoreCase("yes"))
		?Database.getEmployee().stream().filter(x->x.getSalary()>50000).collect(Collectors.toList())
		:Database.getEmployee().stream().filter(x->x.getSalary()<=50000).collect(Collectors.toList());
	}
public static void main(String[] args) {
	System.out.println(result2("no"));
}
}
