package Junit_midterm;

import static org.junit.Assert.*;

import org.junit.Test;

public class junit_test_MTTest {

	@Test
	public void testboolean() {
		assertTrue("Method must be true", junit_test_MT.returnTrue() );
	}

	
	@Test
	public void testsum() {
		assertEquals("5 + 5 = 10",10, junit_test_MT.addtwonumbers(5,5));
}
}