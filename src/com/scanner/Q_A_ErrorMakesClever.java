package com.scanner;

import java.util.Scanner;

public class Q_A_ErrorMakesClever {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter your name: ");
		String name = sc.nextLine();
		System.out.println("Name is: " + name);
		
		System.out.println("Enter your Age: ");
		byte age = sc.nextByte();
		System.out.println("Your age is: " + age);
	}
	
	

}
