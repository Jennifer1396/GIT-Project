package com.mockinterview;

import java.util.Arrays;

public class String_Split {
	
	public static void main (String[] args) {
		
		String s1 = "Java,Selenium,Testing,API,SQL";
		String[] s = s1.split(",");
	
		for (int i = 0; i<s.length; i++) {
			
			System.out.println(s[i]);
		}
	}

}
