package es.jeiroa.exercises.factorial;

import java.math.BigInteger;
import java.util.stream.LongStream;

public class Factorial {

	public long factorial1(long input) {
		long output = 1;

		for (long i = 2; i <= input; i++) {
			output *= i;
		}

		return output;
	}

	public long factorial2(long input) {
		long output = 1;

		if (input > 1) {
			output = input * factorial2(input - 1);
		}
		
		return output;
	}
	
	public long factorial3(long input) {
		return LongStream.rangeClosed(1, input)
			.reduce(1, (acc, n) -> acc * n);
	}
	
	public BigInteger factorial4(long input) {
		BigInteger output = BigInteger.ONE;

		if (input > 1) {
			output = BigInteger.valueOf(input).multiply(factorial4(input - 1));
		}

		return output;
	}
}
