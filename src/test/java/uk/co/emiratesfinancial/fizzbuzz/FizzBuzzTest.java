package uk.co.emiratesfinancial.fizzbuzz;


import org.junit.Test;

import static java.lang.Integer.*;
import static org.junit.Assert.*;


public class FizzBuzzTest {


  @Test
  public void testWhen_1_return_1(){
    // arrange
    FizzBuzz fb = new FizzBuzz();
    String expected = "1";

    // act
    String actual = fb.calculate(parseInt(expected));

    // assert
    assertEquals(String.valueOf(expected), actual);
  }

  @Test
  public void testWhen_2_return_2(){
    // arrange
    FizzBuzz fb = new FizzBuzz();
    String expected = "2";

    // act
    String actual = fb.calculate(parseInt(expected));

    // assert
    assertEquals(String.valueOf(expected), actual);
  }

  @Test
  public void testWhen_3_return_Fizz(){
    // arrange
    FizzBuzz fb = new FizzBuzz();
    String expected = "Fizz";

    // act
    String actual = fb.calculate(3);

    // assert
    assertEquals(expected, actual);
  }

  @Test
  public void testWhen_5_return_Buzz(){
    // arrange
    FizzBuzz fb = new FizzBuzz();
    String expected = "Buzz";

    // act
    String actual = fb.calculate(5);

    // assert
    assertEquals(expected, actual);
  }

  @Test
  public void testWhen_15_return_FizzBuzz(){
    // arrange
    FizzBuzz fb = new FizzBuzz();
    String expected = "FizzBuzz";

    // act
    String actual = fb.calculate(15);

    // assert
    assertEquals(expected, actual);
  }


  @Test
  public void testWhen_13_return_Fizz(){
    // arrange
    FizzBuzz fb = new FizzBuzz();
    String expected = "Fizz";

    // act
    String actual = fb.calculate(13);

    // assert
    assertEquals(expected, actual);
  }

  @Test
  public void testWhen_151_return_Buzz(){
    // arrange
    FizzBuzz fb = new FizzBuzz();
    String expected = "Buzz";

    // act
    String actual = fb.calculate(151);

    // assert
    assertEquals(expected, actual);
  }

  @Test
  public void testWhen_1351_return_FizzBuzz(){
    // arrange
    FizzBuzz fb = new FizzBuzz();
    String expected = "FizzBuzz";

    // act
    String actual = fb.calculate(1351);

    // assert
    assertEquals(expected, actual);
  }


}