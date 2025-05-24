package com.looping_Statements;

public class Diamond_Asterieks {
	
	public static void main(String[] args) {
		
		int rows = 5;   // upper triangle
		
		for(int i = 1; i <= rows; i++) {
			
			for (int j = rows; j > i; j--) {
				
				System.out.print(" "); // to print spaces
			}
			
			for (int k = 1; k <= (i*2) -1; k++) {
				System.out.print("*"); // To print asterisks
			}
			
			System.out.println();
		}
		
		for (int i = rows; i>= 1; i--) { // lower triangle
			
			for (int j = rows; j > i; j--) {
				
				System.out.print(" "); // to print spaces
			}
			
			for (int k = 1; k <= (i*2)-1; k++) {
				System.out.print("*"); // to print asterisks
			}
			System.out.println();
		}
	}
	
	
}
        