package com.seenu;

public class var_arg {
	public static void display(String...values) {
		for(String s :values) {
			System.out.println(s);
		}
	}
	public static void main(String[] args) {
		display();
		display("seenu");
		display("seenu","iglesias");
		display("seenu","iglesias","here","dont","fear");
	}
	}

// The varargs allows the method to accept zero or muliple arguments. 

// Advantage of Varargs : We don't have to provide overloaded methods so less code.

