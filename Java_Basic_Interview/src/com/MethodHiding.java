package com;

import java.lang.reflect.Method;

class Parent {
	
	
	public  static  void display() {
		
		System.out.println("parent class display()");
	}
	
   public void display1() {
		
		System.out.println("parent class display1()");
	}
   
   private void display2() {
		
		System.out.println("parent class display2()");
	}
   
   
    }

public class MethodHiding extends Parent  {
	
public static   void display() {
	
		
		System.out.println("child class display()");
	}

     public  void display1() {
	
	System.out.println("child class display1()");
    }
     
     private  void display2() {
    		
    		System.out.println("child class display2()");
    	    }

	public static void main(String[] args) {
		  
	     Parent p =new MethodHiding();
		 Parent p1 = new Parent();
		MethodHiding mh = new MethodHiding();
		 p.display();
		 p1.display();
		 p.display1();
		 p1.display1();
		 mh.display2();
		 
		 
		 ///using the static method leads to method hiding so 
		 //only parent class method is called both the times. 
		 
		 //private method of parent class can not be overried
		 
		 
		 

	}

}
