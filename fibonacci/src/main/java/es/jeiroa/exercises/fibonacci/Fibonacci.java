package es.jeiroa.exercises.fibonacci;

public class Fibonacci {
	
	private int fib(int count) {
		int fib = count;
		
		if (count > 1) {
			fib = fib(count - 2) + fib(count - 1);
		}

		return fib;
	}

	public int[] fibonacci1(int count) {
		int[] output = new int[count + 1];

		for (int i = 0; i <= count; i++) {
			output[i] = fib(i);
			System.out.print(output[i] + " ");
		}

		return output;
	}

	public int[] fibonacci2(int count) {
		int[] output = new int[count + 1];

		int n1 = 0;
		int n2 = 1;
		for (int i = 0; i <= count; i++) {
			int fib = n1;

			if (i == 1) {
				fib = n2;
			}
			
			if (i > 1) {
				fib = n1 + n2;
				n1 = n2;
				n2 = fib;
			}
			
			output[i] = fib;
			System.out.print(fib + " ");
		}
		
		return output;
	}
}
