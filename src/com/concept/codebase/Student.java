package com.concept.codebase;


public class Student {
	
	public String mycode() {
		return "Hardware is the core element in computer science";
	}
	
	public static void main(String[] args) {
		
		System.out.println(new Student().mycode().toUpperCase().concat(" From free coder"));
	}
	
}
