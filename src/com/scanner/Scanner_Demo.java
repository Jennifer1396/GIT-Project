package com.scanner;

import java.util.Scanner;

public class Scanner_Demo {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter RCB Status");
		String Meghana = sc.nextLine();
		
		if (Meghana.equalsIgnoreCase("Dead")) {
			
			System.out.println("Surya meets Ramya");
		}
		else {
			
			System.out.println("Surya weds Meghana");
			
		}
		
		
		
	}

}
