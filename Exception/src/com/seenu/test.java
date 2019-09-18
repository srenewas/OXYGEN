package com.seenu;

import java.util.Scanner;

public class test {
	public static void status(int age)throws InvalidAgeException {
		if(age>25) {
			System.out.println("Valid For Marriage");
		}else {
			throw new InvalidAgeException("Not Valid Please Try After Getting Age Above 25");
		}
	}
	public static void main(String[] args) throws InvalidAgeException {
		Scanner ss = new Scanner(System.in);
		System.out.println("Enter Your Data");
		int age = ss.nextInt();
		test t = new test();
		t.status(age);
		//test.status(age);
		
	}
}
