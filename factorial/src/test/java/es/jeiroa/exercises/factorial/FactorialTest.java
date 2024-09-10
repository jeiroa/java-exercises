package es.jeiroa.exercises.factorial;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigInteger;

import org.junit.jupiter.api.Test;

class FactorialTest {

	private final Factorial unit = new Factorial();

	@Test
	void testFactorial1() {
		assertEquals(1, unit.factorial1(0));
		assertEquals(1, unit.factorial1(1));
		assertEquals(2, unit.factorial1(2));
		assertEquals(6, unit.factorial1(3));
		assertEquals(24, unit.factorial1(4));
		assertEquals(2432902008176640000L, unit.factorial1(20));
	}

	@Test
	void testFactorial2() {
		assertEquals(1, unit.factorial2(0));
		assertEquals(1, unit.factorial2(1));
		assertEquals(2, unit.factorial2(2));
		assertEquals(6, unit.factorial2(3));
		assertEquals(24, unit.factorial2(4));
		assertEquals(2432902008176640000L, unit.factorial1(20));
	}
	
	@Test
	void testFactorial3() {
		assertEquals(1, unit.factorial3(0));
		assertEquals(1, unit.factorial3(1));
		assertEquals(2, unit.factorial3(2));
		assertEquals(6, unit.factorial3(3));
		assertEquals(24, unit.factorial3(4));
		assertEquals(2432902008176640000L, unit.factorial3(20));
	}
	
	@Test
	void testFactorial4() {
		assertEquals(BigInteger.ONE, unit.factorial4(0));
		assertEquals(BigInteger.ONE, unit.factorial4(1));
		assertEquals(BigInteger.TWO, unit.factorial4(2));
		assertEquals(BigInteger.valueOf(120), unit.factorial4(5));
		assertEquals(new BigInteger("2432902008176640000"), unit.factorial4(20));
		assertEquals(new BigInteger("15511210043330985984000000"), unit.factorial4(25));
	}
}
