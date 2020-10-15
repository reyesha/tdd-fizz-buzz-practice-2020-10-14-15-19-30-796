package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    void should_return_1_when_count_off_given_order_number_1() {

        int orderNumber = 1;
        FizzBuzz fizzBuzz = new FizzBuzz();

        String actual = fizzBuzz.countOff(orderNumber);

        assertEquals("1", actual);
    }

    @Test
    void should_return_Fizz_when_count_off_given_order_number_3() {
        int orderNumber = 3;
        FizzBuzz fizzBuzz = new FizzBuzz();

        String actual = fizzBuzz.countOff(orderNumber);

        assertEquals("Fizz", actual);
    }

    @Test
    void should_return_Buzz_when_count_off_given_order_number_5() {
        int orderNumber = 5;
        FizzBuzz fizzBuzz = new FizzBuzz();

        String actual = fizzBuzz.countOff(orderNumber);

        assertEquals("Buzz", actual);
    }

    @Test
    void should_return_Whizz_when_count_off_given_order_number_7() {
        int orderNumber = 7;
        FizzBuzz fizzBuzz = new FizzBuzz();

        String actual = fizzBuzz.countOff(orderNumber);

        assertEquals("Whizz", actual);
    }
}
