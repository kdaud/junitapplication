package com.concept.codebase;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;


class StudentTest {
	
	Student student = new Student();
	
	@Test
	public void testMycode() {
		assertEquals("Hardware", student.mycode());
	}
	
}
