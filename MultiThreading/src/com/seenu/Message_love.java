package com.seenu;

class Z{
	public static synchronized void message(String msg) {
			System.out.println(msg);
		try {
			Thread.sleep(1100);
		}catch (Exception e) {
            e.printStackTrace();
		}
	}
}
class Love extends Thread{
	public void run() {
		Z.message(" I");
		Z.message("LOVE");
		Z.message(" U");
	}
}
public class Message_love {
	public static void main(String[] args) {
		Love mt1 = new Love();
		mt1.start();
		try {
			mt1.join();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}