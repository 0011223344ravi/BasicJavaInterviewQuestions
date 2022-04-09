package com;
import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>
{
	 int rollno;
	 String name;
	 int age ;
	 
	 Student(int rollno, String name , int age ){
		 this.rollno=rollno;
		 this.name = name ;
		 this.age = age ;
	 }
	
	@Override
	public int compareTo(Student s) {
		if(age >s.age) 
			return -1 ;
		else if(age <s.age)
			return 1;
		else 
		    return 0;
	}
	
}

public class ComparableExample {

	
	public static void main(String[] args) {
		 
ArrayList<Student> al = new ArrayList<Student>();
al.add(new Student (101,"Ravi",25));
al.add(new Student (102,"kavi",26));
al.add(new Student(105,"tavi",21));
System.out.println(al);
Collections.sort(al);
for(Student s:al) {
	System.out.println(""+s.rollno+""+s.name+""+s.age);
}


	}

	 

}
