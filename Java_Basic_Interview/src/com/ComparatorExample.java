package com;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorExample implements Comparator<Integer> {
	@Override
	public int compare(Integer o1, Integer o2) {
		if(o1>o2)
			return -1;
		else if (o1<o2)
			return 1;
		else 
			return 0;
	}


	public static void main(String[] args) {
		System.out.println("Hello Comparator");
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(5);
		al.add(25);
		al.add(30);
		al.add(15);
		System.out.println(al);
		Collections.sort(al,new ComparatorExample());;
		System.out.println(al);
		

	}

	
}
