package com;

public class ObjectEligibleForGarbageCollector {

	public static void main(String[] args) {
		
		
		String s="acb";
		s=null;
		System.out.println(s);
		System.out.println("object s is now eligible for garbage collection ");
		

	}

}
