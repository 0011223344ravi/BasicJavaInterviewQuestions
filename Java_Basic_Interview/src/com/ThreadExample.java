package com;

public class ThreadExample extends Thread {

	public static void main(String[] args) {
		ThreadExample t = new ThreadExample();
		t.start();

	}

	 
	  public void run () { System.out.println("theard run method"); }
	 

}
