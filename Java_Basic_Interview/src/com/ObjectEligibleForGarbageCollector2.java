package com;

public class ObjectEligibleForGarbageCollector2 {

	public static void main(String[] args) {
	 String s1 ="Ravi";
	 String s2 ="Habi";
	 s1=s2;
	 System.out.println(s1);
	 //System.out.println(s2);
	 System.out.println("s1 is now available for garbage collection as it is not pointing to Ravi");

	}

}
