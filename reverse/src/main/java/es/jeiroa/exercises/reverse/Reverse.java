package es.jeiroa.exercises.reverse;

public class Reverse {

	public String reverse1(String input) {
		if (input == null || input.isEmpty()) {
			return input;
		}

		final StringBuilder output = new StringBuilder();

		for (int i = input.length() - 1; i >= 0; i--) {
			output.append(input.charAt(i));
		}

		return output.toString();
	}
	
	public String reverse2(String input) {
		if (input == null || input.isEmpty()) {
			return input;
		}

		char[] output = input.toCharArray();

		for (int i = 0; i < output.length / 2; i++) {
			char temp = output[i];
			output[i] = output[output.length - i - 1];
			output[output.length - i - 1] = temp;
		}

		return new String(output);
	}
	
	public String reverse3(String input) {
		if (input == null || input.isEmpty()) {
			return input;
		}
		
		return new StringBuilder(input).reverse().toString();
	}
	
	public String reverse4(String input) {
		if (input == null || input.length() <= 1) {
			return input;
		} else {
			return reverse4(input.substring(1)) + input.charAt(0); 
		}
	}
	
}
