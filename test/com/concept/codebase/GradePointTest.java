package com.concept.codebase;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


class GradePointTest {
	
	GradePoint obj = new GradePoint();
	@Test
	void testMyGradePoint() {
		
		assertEquals(81, obj.myGradePoint(39, 42));
		//fail("Not yet implemented");
	}
	
	@Test
	void testMyName() {
		assertEquals("Daud Kakumirizi", obj.myName("Daud", "Kakumirizi"));
	}
	
}
