package es.jeiroa.exercises.palindrome;

import java.util.Objects;

public class Palindrome {

	public boolean isPalindrome1(String input) {
		boolean output = true;

		Objects.requireNonNull(input);	

		int i = 0;
		int j = input.length() - 1;
		
		while (output && (i < j)) {
			if (input.charAt(i) != input.charAt(j)) {
				output = false;
			} else {
				i++;
				j--;
			}
		}

		return output;
	}

	public boolean isPalindrome2(String input) {
		boolean output = true;

		Objects.requireNonNull(input);

		if (input.length() > 1) {
			output = (input.charAt(0) == input.charAt(input.length() - 1)) &&
				isPalindrome2(input.substring(1, input.length() - 1));
		}

		return output;
	}
}
