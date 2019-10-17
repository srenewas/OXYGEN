package com.seenu;

class mythread implements Runnable{

	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("user thread :"+1);
		}
	}
}
public class runnable {
	public static void main(String[] args) {
		mythread mt = new mythread();
		Thread t = new Thread(mt);
		t.start();
		for(int i=0;i<5;i++) {
			System.out.println("main thread :"+i);
		}
	}
}
