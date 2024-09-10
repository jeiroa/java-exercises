package es.jeiroa.exercises.palindrome;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PalindromeTest {

	private final Palindrome unit = new Palindrome();

	@Test
	void testPalindrome1() {
		assertEquals(true, unit.isPalindrome1("racecar"));
		assertEquals(true, unit.isPalindrome1("a"));
		assertEquals(true, unit.isPalindrome1("aa"));
		assertEquals(false, unit.isPalindrome1("ab"));
		
		assertThrows(NullPointerException.class, () -> unit.isPalindrome1(null));
	}
	
	@Test
	void testPalindrome2() {
		assertEquals(true, unit.isPalindrome2("racecar"));
		assertEquals(true, unit.isPalindrome2("a"));
		assertEquals(true, unit.isPalindrome2("aa"));
		assertEquals(false, unit.isPalindrome2("ab"));
		
		assertThrows(NullPointerException.class, () -> unit.isPalindrome2(null));
	}
}
