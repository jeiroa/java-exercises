package es.jeiroa.exercises.fibonacci;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FibonacciTest {

	private Fibonacci unit = new Fibonacci();

	@Test
	void testFibonacci1() {
		assertArrayEquals(new int[] {0}, unit.fibonacci1(0));
		System.out.println();
		assertArrayEquals(new int[] {0, 1}, unit.fibonacci1(1));
		System.out.println();
		assertArrayEquals(new int[] {0, 1, 1}, unit.fibonacci1(2));
		System.out.println();
		assertArrayEquals(new int[] {0, 1, 1, 2}, unit.fibonacci1(3));
		System.out.println();
		assertArrayEquals(new int[] {0, 1, 1, 2, 3}, unit.fibonacci1(4));
	}
	
	@Test
	void testFibonacci2() {
		assertArrayEquals(new int[] {0}, unit.fibonacci2(0));
		System.out.println();
		assertArrayEquals(new int[] {0, 1}, unit.fibonacci2(1));
		System.out.println();
		assertArrayEquals(new int[] {0, 1, 1}, unit.fibonacci2(2));
		System.out.println();
		assertArrayEquals(new int[] {0, 1, 1, 2}, unit.fibonacci2(3));
		System.out.println();
		assertArrayEquals(new int[] {0, 1, 1, 2, 3}, unit.fibonacci2(4));
	}
}
