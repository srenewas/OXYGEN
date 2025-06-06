package com.map;

public class Employee {
    private int Id;
    private String name;
    private Double salary;

    public Employee(int id, String name, Double salary) {
        Id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Emoloyee{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}

