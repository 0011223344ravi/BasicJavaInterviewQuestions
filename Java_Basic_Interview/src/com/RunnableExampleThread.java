package com;

public class RunnableExampleThread implements Runnable {

	public static void main(String[] args) {
		 Thread t = new Thread(new RunnableExampleThread ());
		 t.start();

	}

	
	 public void run() {
		 System.out.println("Runnable run method");
	 }
}
