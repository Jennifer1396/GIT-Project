package com.scanner;

import java.util.Scanner;

public class Divide_By_Ten {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Name: ");
		String name = sc.nextLine();
		
		
		System.out.println("Enter your Marks: ");
		int marks = sc.nextInt();
		sc.nextLine();
		
		if(marks>100) {
			
			System.out.println("Enter marks for 100:");
			System.out.println("Please re-enter your marks:");
			marks = sc.nextInt();
			sc.nextLine();
					}
	
		
		System.out.println("Enter your Department: ");
		String department = sc.nextLine();
		
		float totalMarks = (float) (marks/10.0);
		System.out.println("Score is: " + totalMarks);
		
	}

}
