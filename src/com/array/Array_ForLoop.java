package com.array;

import java.util.Scanner;

public class Array_ForLoop {
	
	public static void main (String[] args) {
		
		int marks[] = new int[10];
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter 10 Numbers:");
		
		for (int i=0; i<marks.length; i++) {		
			
			
			marks[i] = scan.nextInt();
		}
		
		System.out.println("The result of given numbers:");
		
		for(int i=0; i<marks.length; i++) {		
			
			
			System.out.println(marks[i]);
		}
	}

}
