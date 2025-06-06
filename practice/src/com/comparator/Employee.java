package com.comparator;

import java.util.Comparator;

public class Employee {
    String name;
    double Salary;

    public Employee(Double salary, String name) {
        Salary = salary;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", Salary='" + Salary + '\'' +
                '}';
    }
}