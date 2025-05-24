package com.array;

import java.util.Scanner;

public class Print_2Table {
	
	public void print2Table() {
		
		for(int i=1; i<=12; i++) {
			
			System.out.println(i + "x12=" + (i*12));
		}
	}
	
	private void inputTable() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number to print the taable:");
		
		int table = scan.nextInt();		
		
		for (int i=1; i<=10; i++) {			
			
			System.out.println(i + "x" + table + "=" + (i*table));
				
		}	
	
			
		}
	
	public void evenOdd(int num) {
		
		if (num % 2 == 0) {
			
			System.out.println(num + " is Even");
		}
		else {
			
			System.out.println(num+ " is odd");
		}
		
		
	}
	
	
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number to find even/odd:");
		int number = scan.nextInt();
		
		Print_2Table obj = new Print_2Table();
		//obj.print2Table();
		//obj.inputTable();
		obj.evenOdd(number);
	}

}
