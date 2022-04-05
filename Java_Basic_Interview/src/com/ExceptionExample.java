package com;

class CustomException extends Exception{
	
	
	public CustomException(String str) {
		
		super(str);
	}
}

public class ExceptionExample {
	
	public static void vote(int age ) throws CustomException {
		
		if(age >18) {
			System.out.println("Welcome to vote");
		}
		
		else {
			throw new CustomException("age is not valid");
		}
	}

	public static void main(String[] args) throws CustomException {
		vote (13); 

	}

}
