package com.seenu;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{
	String name;
	int age;
	String Company;
	public Student(String name, int age, String company) {
		super();
		this.name = name;
		this.age = age;
		Company = company;
	}
	
}
public class Serialize {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileOutputStream fos = new FileOutputStream("abc.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		Student stu1 = new Student("seenu", 25, "google");
		Student stu2 = new Student("suhas", 10, "htc");
		oos.writeObject(stu1);
		oos.writeObject(stu2);
		System.out.println("*******SERIALIZATION IS COMPLETED*******");   // IT WILL BE STORED IN YOUR WORKPLACE CHECK ONCE
		
		FileInputStream fis = new FileInputStream("abc.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Student stu3 = (Student) ois.readObject();
		System.out.println("*******DESERIALIZATION IS COMPLETED*******");  // IT WILL BE STORED IN YOUR WORKPLACE CHECK ONCE
	}
}
