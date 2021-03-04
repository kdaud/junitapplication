/**
 * 
 */
package com.concept.codebase;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;


/**
 * @author opensource
 *
 */
class LecturerTest {
	
	/**
	 * Test method for {@link com.concept.codebase.Lecturer#calc(int, int)}.
	 */
	Lecturer lecturer = new Lecturer();
	
	@Test
	@Ignore
	void testCalc() {
		assertEquals(18, lecturer.calc(9, 11));
	}
	
	@Test
	void testDepartmentSector() {
		assertEquals("Computing & Informatics", lecturer.departmentsector("Computing & Informatics"));
	}
	
}
