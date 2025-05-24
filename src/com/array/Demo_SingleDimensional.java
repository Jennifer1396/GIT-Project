package com.array;

public class Demo_SingleDimensional {
	
	public void literal() {
		
		int[] ar = {10, 15, 20, 25};
		
		
		System.out.println(ar[2]);	// using index value
		
	}
	
	public void nonliteral() {
		
		int[] nl = new int[5];
		
		nl[0] = 5;
		nl[1] = 10;
		nl[2] = 15;
		nl[3] = 20;
		nl[2] = 25;
		
		for (int i=0; i<nl.length; i++) { // using for loop
			
			System.out.println(nl[i]);
		}
		
		
	}
		
	public static void main(String[] args) {
		
		Demo_SingleDimensional dm = new Demo_SingleDimensional();
		//dm.literal();
		dm.nonliteral();
	}		

}
