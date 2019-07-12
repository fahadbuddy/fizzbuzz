package uk.co.emiratesfinancial.fizzbuzz;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.stream.IntStream;

public class Main {

	private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

	public static void main(String[] args) {

		FizzBuzz fb = new FizzBuzz();

		IntStream.rangeClosed(1, 100).forEach((n) -> {
			String result = fb.calculate(n);
			LOGGER.info(result);
		});

	}

}
