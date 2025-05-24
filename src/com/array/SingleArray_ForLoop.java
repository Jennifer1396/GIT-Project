package com.array;

import java.util.Scanner;

public class SingleArray_ForLoop {
	
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] marks = new int[5];		
		
		
		for(int i=0; i<=4; i++) {
			
			marks[i] = scan.nextInt();
		}
		
		for (int i=0; i<=4; i++) {
			
			System.out.println(marks[i]);
		}
		
	}
	

}
