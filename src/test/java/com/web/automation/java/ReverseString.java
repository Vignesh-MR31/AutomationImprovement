package com.web.automation.java;

public class ReverseString {

	public static void main(String[] args) {
		
		String string = "selenium";
		StringBuilder reverseString = new StringBuilder();
		
		for(int i = string.length()-1; i>=0;i--) {
			reverseString.append(string.charAt(i));
		}
		
		System.out.println(reverseString);

	}

}
