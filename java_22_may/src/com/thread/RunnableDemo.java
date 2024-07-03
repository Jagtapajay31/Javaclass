package com.thread;

class Second implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 1; i <=5; i++) {
			System.out.println("this is Second thread");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
public class RunnableDemo {
	public static void main(String[] args) throws InterruptedException {
		Second s1=new Second();
		
		Thread t1=new Thread(s1);
		t1.start();
		
		for (int i = 1; i <=5; i++) {
			System.out.println("this is second thread");
			Thread.sleep(2000);
		}
	}
}
}