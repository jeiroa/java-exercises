package es.jeiroa.exercises.raindrops;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RaindropsTest {

	private final Raindrops unit = new Raindrops();

	@Test
	void testRaindrops1() {
		assertEquals("Plong", unit.raindrops1(28));
		assertEquals("PlingPlang", unit.raindrops1(30));
		assertEquals("34", unit.raindrops1(34));
	}

	@Test
	void testRaindrops2() {
		assertEquals("Plong", unit.raindrops2(28));
		assertEquals("PlingPlang", unit.raindrops2(30));
		assertEquals("34", unit.raindrops2(34));
	}
}
