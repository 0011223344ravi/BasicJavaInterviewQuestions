package com;

public class StringBasics {

	public static void main(String[] args) {
		String s1 ="abc";
		String s2 = "abc";
		String s3 = new String("abc");
		
		
		StringBuffer sb = new StringBuffer("abc");
		
		
		if(s1==s2) {
			System.out.println("s1==s2 is true");
		}
		
		else {
			System.out.println("s1==s2 is false");	
		}
		
		
		if(s1==s3) {
			System.out.println("s1==s3 is true");
		}
		
		else {
			System.out.println("s1==s3 is false");	
		}
		

		 
		
		
		
	 if(s1.equals(s2)) {
        	 System.out.println("s1.equals(s2) is true");
         }
	 
	 else {
		 System.out.println("s1.equals(s2) is false");
	 }
	 
	 if(s1.equals(s3)) {
    	 System.out.println("s1.equals(s3) is true");
     }
 
 else {
	 System.out.println("s1.equals(s3) is false");
 }
	 
	 if(s1.equals(sb)) {
    	 System.out.println("s1.equals(sb) is true");
     }
 
 else {
	 System.out.println("s1.equals(sb) is false");
 }
	 
	 
	 
	 
	 
	 System.out.println("s1 hashcode :-"+s1.hashCode());
     System.out.println("s2 hashcode :-"+s2.hashCode());
     
     System.out.println("s3 hashcode :-"+s3.hashCode());
     System.out.println("sb hashcode :-"+sb.hashCode());
         

	}

}
