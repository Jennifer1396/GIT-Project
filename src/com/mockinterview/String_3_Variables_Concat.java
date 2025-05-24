package com.mockinterview;

public class String_3_Variables_Concat{
	
	public static void main(String args[]) {
		
		String str1 = "ABC";
		String str2 = "DEF";
		String str3 = "GHI";
		
//		String s1 = str2.concat(str3); // only parameter will take in concat method.
//		String s2 = str1.concat(s1);
//		System.out.println(s2);
//		
//		System.out.println(str1+str2+str3);
		
		String concat1 = str1.concat(str2).concat(str3);
		System.out.println(concat1);
	}	
	
}
