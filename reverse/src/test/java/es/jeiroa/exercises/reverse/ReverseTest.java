package es.jeiroa.exercises.reverse;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseTest {

	private final Reverse unit = new Reverse();

	@Test
	void testReverse1() {
		assertEquals("desserts", unit.reverse1("stressed"));
		assertEquals("sports", unit.reverse1("strops"));
		assertEquals("racecar", unit.reverse1("racecar"));
		assertEquals(null, unit.reverse1(null));
		assertEquals("", unit.reverse1(""));
		assertEquals("a", unit.reverse1("a"));
		assertEquals("ba", unit.reverse1("ab"));
	}

	@Test
	void testReverse2() {
		assertEquals("desserts", unit.reverse2("stressed"));
		assertEquals("sports", unit.reverse2("strops"));
		assertEquals("racecar", unit.reverse2("racecar"));
		assertEquals(null, unit.reverse2(null));
		assertEquals("", unit.reverse2(""));
		assertEquals("a", unit.reverse2("a"));
		assertEquals("ba", unit.reverse2("ab"));
	}
	
	@Test
	void testReverse3() {
		assertEquals("desserts", unit.reverse3("stressed"));
		assertEquals("sports", unit.reverse3("strops"));
		assertEquals("racecar", unit.reverse3("racecar"));
		assertEquals(null, unit.reverse3(null));
		assertEquals("", unit.reverse3(""));
		assertEquals("a", unit.reverse3("a"));
		assertEquals("ba", unit.reverse3("ab"));
	}
	
	@Test
	void testReverse4() {
		assertEquals("desserts", unit.reverse4("stressed"));
		assertEquals("sports", unit.reverse4("strops"));
		assertEquals("racecar", unit.reverse4("racecar"));
		assertEquals(null, unit.reverse4(null));
		assertEquals("", unit.reverse4(""));
		assertEquals("a", unit.reverse4("a"));
		assertEquals("ba", unit.reverse4("ab"));
	}
}
