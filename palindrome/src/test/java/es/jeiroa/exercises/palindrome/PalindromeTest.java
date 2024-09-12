package es.jeiroa.exercises.palindrome;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PalindromeTest {

	private final Palindrome unit = new Palindrome();

	@Test
	void testPalindrome1() {
		assertTrue(unit.isPalindrome1("racecar"));
		assertTrue(unit.isPalindrome1("a"));
		assertTrue(unit.isPalindrome1("aa"));
		assertFalse(unit.isPalindrome1("ab"));
		
		assertThrows(NullPointerException.class, () -> unit.isPalindrome1(null));
	}
	
	@Test
	void testPalindrome2() {
		assertTrue(unit.isPalindrome2("racecar"));
		assertTrue(unit.isPalindrome2("a"));
		assertTrue(unit.isPalindrome2("aa"));
		assertFalse(unit.isPalindrome2("ab"));
		
		assertThrows(NullPointerException.class, () -> unit.isPalindrome2(null));
	}
}
