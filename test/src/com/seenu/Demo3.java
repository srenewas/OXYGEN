package com.seenu;

class A{
	public static synchronized void message(String msg) {
		System.out.println(msg);
		try {
			Thread.sleep(1200);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
class mythread1 extends Thread{
	public void run() {
		A.message(" I");
		A.message("LOVE");
		A.message(" U");
	}
}

public class Demo3 {
	public static void main(String[] args) {
		mythread1 mt1 = new mythread1();
		mt1.start();
		try {
			mt1.join();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}