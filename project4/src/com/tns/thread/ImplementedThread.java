package com.tns.thread;

public class ImplementedThread implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Runnable interface");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplementedThread ob=new ImplementedThread();
		Thread t=new Thread(ob);
		t.start();
		}


}
