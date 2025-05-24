package com.scanner;

import java.util.Scanner;

public class Name_Age_Address {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter your Initial: ");
		char initial = sc.next().charAt(0);
		
		System.out.println("Enter your Age: ");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter your Address: ");
		String address = sc.nextLine();
		
		System.out.println("Name is : " + name);
		System.out.println("Initial is : " + initial);
		System.out.println("Age is : " + age);
		System.out.println("Address is : " + address);
		
		
		
		
	}

}
