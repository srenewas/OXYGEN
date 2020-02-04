package com.seenu;

import java.io.*;

public class console_jdk_6 {
	public static void main(String[] args) throws Exception {
		String str; 
        Console con = System.console(); 
        if(con == null)  
        { 
            System.out.print("No console available"); 
            return; 
        } 
        str = con.readLine("Enter your name: "); 
        con.printf("Here is your name: %s\n", str); 
        System.out.println("Enter the password: "); 
        char[] ch=con.readPassword(); 
        String pass = String.valueOf(ch); 
        System.out.println("Password is: " + pass); 
	}
}
