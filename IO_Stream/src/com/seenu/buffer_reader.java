package com.seenu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class buffer_reader {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter The Data");
		String data1 = reader.readLine();
		System.out.println("Enter Same Data");
		int data2 = reader.read();
		System.out.println(data1);
		System.out.println(data2);
	}

}
