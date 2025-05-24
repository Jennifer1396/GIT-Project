package com.stringfunctions;

public class Comparing_2_Strings {
	
	public static void main(String args[]) {
		
		
		System.out.println("Value store in same memory");
		System.out.println("--------------------------");
		String a = "one"; // same references
		String b = "one";
		String c=b;
		
		System.out.println(c==a);
		
		System.out.println("Value store in differnt memory");
		System.out.println("------------------------------");
		String a1 = "Two"; 
		String a2 = new String("Two");// stored on a different memory becoz 'new' keyword is used. 
		String c2 = a2;
		
		System.out.println(c2==a1);
		
		
	}

}
