package xyz.fabiodamico.fizzbuzz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzShould {

    private FizzBuzz fizzBuzz;

    @BeforeEach
    void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @ParameterizedTest
    @CsvSource({
            "1, 1",
            "2, 2",
            "4, 4",
            "7, 7",
    })
    void return_same_output_given_the_input(int input, String expected) {
        String actual = fizzBuzz.play(input);
        assertThat(actual).isEqualTo(expected);
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 6, 9, 12, 18, 21, 24, 27})
    void return_fizz_for_the_multiple_of_three(int input) {
        String result = fizzBuzz.play(input);
        assertThat(result).isEqualTo("Fizz");
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 10, 20, 25, 35, 40})
    void return_buzz_for_the_multiple_of_three(int input) {
        String result = fizzBuzz.play(input);
        assertThat(result).isEqualTo("Buzz");
    }

    @ParameterizedTest
    @ValueSource(ints = {15, 30, 45, 60, 105, 120})
    void return_fizzbuzz_when_input_is_divisible_by_three_and_five() {
        String actual = fizzBuzz.play(15);
        assertThat(actual).isEqualTo("FizzBuzz");
    }
}