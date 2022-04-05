package com;

public class ClonningExample implements Cloneable {

	public static void main(String[] args) throws CloneNotSupportedException {
		 
		ClonningExample obj = new ClonningExample();
		ClonningExample obb= (ClonningExample) obj.clone();
		System.out.println(obj);
		System.out.println(obb);
		System.out.println(obj.hashCode());
		System.out.println(obb.hashCode());
	}

}
