package uk.co.emiratesfinancial.fizzbuzz;

public class FizzBuzz {
  public String calculate(final int number) {

    StringBuilder b = new StringBuilder();

    if (number % 3 == 0) {
      b.append("Fizz");
    }

    if (number % 5 == 0) {
      b.append("Buzz");
    }

    String result = b.length() > 0 ? b.toString() : String.valueOf(number);

    return result;
  }
}
