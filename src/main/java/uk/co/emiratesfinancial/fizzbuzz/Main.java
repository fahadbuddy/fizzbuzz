package uk.co.emiratesfinancial.fizzbuzz;

import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {

		FizzBuzz fb = new FizzBuzz();

		IntStream.rangeClosed(1, 100).forEach((n) -> {
			String result = fb.calculate(n);
			System.out.println(result);
		});

	}

}
