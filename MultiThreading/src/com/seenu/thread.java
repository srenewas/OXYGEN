package com.seenu;

class Tthread extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
		System.out.println("user thread :"+i);
		}	
		}
}

public class thread {
	public static void main(String[] args) {
		Tthread mt = new Tthread();
		mt.start();
		for(int i=0;i<5;i++) {
		System.out.println("main thread :"+i);
		}
	}

}
