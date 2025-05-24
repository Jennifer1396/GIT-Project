package com.scanner;

import java.util.Scanner;

public class Add_Two_Num {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		long sum1 = sc.nextLong();
		
			
		System.out.println("Enter Second number:");
		long sum2 = sc.nextLong();
	
		
		System.out.println("The sum of " + sum1 +" & "+ sum2 + " is : " + (sum1+sum2));			
		
	}

}
