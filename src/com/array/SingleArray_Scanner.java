package com.array;

import java.util.Scanner;

public class SingleArray_Scanner {
	
	public static void main(String args[]) {
		
		int sum[] = new int[5];
		
			
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the First number:");
		sum[0] = sc.nextInt();
				
		System.out.println("Enter the Second number:");
		sum[1] = sc.nextInt();
			
		System.out.println("Enter the Third number:");
		sum[2] = sc.nextInt();
				
		System.out.println("Enter the Fourth number:");
		sum[3] = sc.nextInt();
				
		System.out.println("Enter the Fifth number:");
		sum[4]= sc.nextInt();
				
		System.out.println("The sum is :" + (sum[0]+sum[1]+sum[2]+sum[3]+sum[4]));
	}

}
