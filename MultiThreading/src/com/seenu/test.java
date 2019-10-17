package com.seenu;

class A{
	public static synchronized void message(String msg) {
		System.out.println(msg);
		try {
			Thread.sleep(1000);
		}catch (Exception e) {
            e.printStackTrace();
		}
	}
}
class mythread1 extends Thread{
	public void run() {
		A.message(" I");
	}
}
class mythread2 extends Thread{
	public void run() {
		A.message("LOVE");
	}
}
class mythread3 extends Thread{
	public void run() {
		A.message(" U");
	}
}
public class test {
	public static void main(String[] args) {
		mythread1 mt1 = new mythread1();
		mt1.start();
		try {
			mt1.join();
		}catch (Exception e) {
			e.printStackTrace();
		}
		mythread2 mt2 = new mythread2();
		mt2.start();
		try {
			mt2.join();
		}catch (Exception e) {
			e.printStackTrace();
		}
		mythread3 mt3 = new mythread3();
		mt3.start();
	}
}
