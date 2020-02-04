package com.seenu;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

class Employee implements Externalizable{
	String name;
	int id;
	String company;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, int id, String company) {
		super();
		this.name = name;
		this.id = id;
		this.company = company;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", company=" + company + "]";
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name= (String) in.readObject();
		id = in.readInt();
		company=(String) in.readObject();
	}
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(name);
		out.writeInt(id);
		out.writeObject(company);
	}
}
public class Externilize {
	public static void main(String[] args) {
		Employee emp = new Employee("seenu", 123, "google");
		Employee emp2 = new Employee("suhas", 186, "cognizant");
		Employee newemployee = null;
		try {
			FileOutputStream fos = new FileOutputStream("xyzz.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(emp);
			oos.flush();
		}catch(Exception e){
			e.printStackTrace();
		}
		try {
			FileInputStream fis = new FileInputStream("xyzz.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			newemployee =  (Employee) ois.readObject();
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("*******AFTER SERIALIZATION*******\n"+emp);
		//System.out.println(emp);
		System.out.println("******BEFORE SERIALIZATION*******\n"+newemployee);
		//System.out.println(newemployee);
	}
}
