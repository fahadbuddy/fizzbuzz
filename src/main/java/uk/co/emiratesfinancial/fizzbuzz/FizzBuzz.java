package uk.co.emiratesfinancial.fizzbuzz;

/**
 * This class return Fizz, Buzz or FizzBuzz depending on the number being divisible by 3, 5 or both.
 */
public class FizzBuzz {
  public String calculate(final int number) {

    StringBuilder b = new StringBuilder();

    if (number % 3 == 0 || containsThree(number)) {
      b.append("Fizz");
    }

    if (number % 5 == 0 || containsFive(number)) {
      b.append("Buzz");
    }

    String result = b.length() > 0 ? b.toString() : String.valueOf(number);

    return result;
  }

  private boolean containsFive(final int number) {

    return checkContainsNumber(number, "5");
  }

  private boolean containsThree(final int number) {

    return checkContainsNumber(number, "3");
  }

  private boolean checkContainsNumber(final int number, final String s) {

    String strNumber = String.valueOf(number);

    if (strNumber.contains(s)) {
      return true;
    }

    return false;
  }
}
