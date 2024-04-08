package es.jeiroa.exercises.raindrops;

import java.util.stream.Stream;

public class Raindrops {

	private record Pair(int key, String value) {}
	
	public String raindrops1(int input) {
		final StringBuilder output =
			Stream.of(new Pair(3, "Pling"), new Pair(5, "Plang"), new Pair(7, "Plong"))
				.filter(p -> input % p.key() == 0)
				.map(Pair::value)
				.collect(StringBuilder::new,
					StringBuilder::append,
					StringBuilder::append);
		
		if (output.isEmpty()) {
			output.append(input);
		}

		return output.toString();
	}
	
	public String raindrops2(int input) {
		final StringBuilder output = new StringBuilder();

		if (input % 3 == 0) {
			output.append("Pling");
		}

		if (input % 5 == 0) {
			output.append("Plang");
		}

		if (input % 7 == 0) {
			output.append("Plong");
		}

		if (output.isEmpty()) {
			output.append(input);
		}

		return output.toString();
	}
}
