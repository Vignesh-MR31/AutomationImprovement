package com.web.automation.java;

public class StringExcercise {
	
	public static void main(String args[]) {
		String s = "Test";
		s.concat("Automation");
		System.out.println(s);
		s = s.concat(" Automation");
		System.out.println(s);
		
		StringBuilder sb = new StringBuilder("Test");

		sb.append("A");
		sb.append("B");
		System.out.println(sb);
	}
	
	

}
