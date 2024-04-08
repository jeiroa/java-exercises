package es.jeiroa.exercises.leap;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LeapTest {

	private Leap unit = new Leap();

	@Test
	void testIsLeap1() {
		assertEquals(false, unit.isLeap1(1900));
		assertEquals(false, unit.isLeap1(1997));
		assertEquals(true, unit.isLeap1(2000));
	}

	@Test
	void testIsLeap2() {
		assertEquals(false, unit.isLeap2(1900));
		assertEquals(false, unit.isLeap2(1997));
		assertEquals(true, unit.isLeap2(2000));
	}
	
	@Test
	void testIsLeap3() {
		assertEquals(false, unit.isLeap3(1900));
		assertEquals(false, unit.isLeap3(1997));
		assertEquals(true, unit.isLeap3(2000));
	}
}
