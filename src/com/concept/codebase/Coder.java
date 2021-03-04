package com.concept.codebase;


public class Coder {
	
	private String name;
	
	private int age;
	
	public Coder(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public static class Sophormore extends Coder {
		
		public Sophormore(String name, int age) {
			super(name, age);
			// TODO Auto-generated constructor stub
		}
		private String name;
		
		private String patientId;
		
//		public Sophormore(String name) {
//			super(name);
//			this.name = name;
//		}
	}
}
