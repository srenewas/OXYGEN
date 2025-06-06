package com.map;

import java.util.*;

public class test {
    public static void main(String[] args) {
        Map<String, Employee> map = new HashMap<>();
        map.put("Emp1",new Employee(101,"srinivas",65000.00));
        map.put("Emp2",new Employee(102,"sujatha",75000.00));
        map.put("Emp3",new Employee(103,"buddodu",89000.00));

        System.out.println("*********Values*********");
        map.entrySet().stream().map(s->s.getValue()).forEach(System.out::println);
        System.out.println("*********Keys*********");
        map.entrySet().stream().map(s->s.getKey()).forEach(System.out::println);
        System.out.println("*********Fetching_Names_from_Map_Values*********");
        map.values().stream().map(s->s.getName()).forEach(System.out::println);
        System.out.println("*********Salary_Based_On_Filter*********");
        map.values().stream().filter(s->s.getSalary() > 80000).map(s->s.getSalary()).forEach(System.out::println);
        System.out.println("*********Filter_Based_On_Name*********");
        map.values().stream().filter(s-> s.getName().startsWith("s")).forEach(System.out::println);

        /*Set<String> set = map.keySet();
        //System.out.println(set);                // Only sop
        set.forEach(s-> System.out.println(s)); // Using Lambda expression
        set.forEach(System.out::println);       // Using method refference

        Collection<Employee> cl = map.values();
        //System.out.println(cl);
        cl.forEach(System.out::println);
        cl.forEach(s->System.out.println(s));

        Set<Map.Entry<String, Employee>> ss = map.entrySet();
        System.out.println(ss);
        for(Map.Entry<String,Employee> entry : ss){
            System.out.println(entry.getKey()+"-->"+entry.getValue());
        }

        for(Employee emp : map.values()){
            if("SU".equals(emp.getName())){
                System.out.println(emp);
            }
        }*/

    }
}
