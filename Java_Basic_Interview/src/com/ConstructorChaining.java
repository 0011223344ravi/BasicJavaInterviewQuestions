package com;

 

public class ConstructorChaining {
	ConstructorChaining(){
	this("this is contructor chaining");
	}

  ConstructorChaining(String string) {
		 System.out.println(string);
	}

	public static void main(String[] args) {
		ConstructorChaining ch = new ConstructorChaining();
		 

	}

}
//constructor  ConstructorChaining(String string) {
//System.out.println(string);
//}
//is called inside ConstructorChaining(){
//this("this is contructor chaining");
//}