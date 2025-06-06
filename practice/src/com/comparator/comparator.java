package com.comparator;

import jdk.nio.mapmode.ExtendedMapMode;

import java.util.*;

public class comparator {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(65000.0,"srini"));
        list.add(new Employee(60000.0,"sujju"));
        list.add(new Employee(70000.0,"buddu"));
        list.add(new Employee(55000.0,"dani"));
        list.add(new Employee(45000.0,"rexi"));

        Collections.sort(list,new nameComparator());
        //Collections.sort(list,new salaryComparator());
        for(Employee emp : list){
            System.out.println(emp);
        }
    }
}
class nameComparator implements Comparator<Employee>{
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.name.compareTo(o2.name);
    }
}
class salaryComparator implements Comparator<Employee>{

    @Override
    public int compare(Employee oo1, Employee oo2) {
        return Double.compare(oo1.Salary,oo2.Salary);
    }
}

