package com.seenu.Lambda_Expression;

public class Thread_Runnable {
	public static void main(String[] args) {
		Runnable r = ()->{
			System.out.println("Main Thread running");
			for(int i=1;i<=10;i++) {
				System.out.println(i);
			}
		};
		Thread t = new Thread(r);
		t.start();
	}
}
