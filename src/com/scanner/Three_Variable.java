package com.scanner;

import java.util.Scanner;

public class Three_Variable {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("***Value 1:");
		int value1 = sc.nextInt();
		
		System.out.println("***Value 2:");
		int value2 = sc.nextInt();
		
		System.out.println("***Value 3:");
		int value3 = sc.nextInt();
		
		
		int d = value1*value2*value3;		
		System.out.println("Multiplication of Values is: " + d);
		
		int e = value1+value2+value3;
		System.out.println("Addition of Values is: " + e);
		
		int final1 = (d/e);
		
		
		System.out.println("The Final Output is: " + final1);
		
	}

}
