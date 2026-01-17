package com.web.automation.java;

public class NumberOfRepeatingCharacter {

	public static void main(String[] args) {
		String string = "automation testing";
		char character = 't';
		int count = 0;
		for(int i = 0; i<string.length();i++) {
			if(string.charAt(i) == character) {
				count++;
			}
		}
		System.out.println(count);

	}

}
