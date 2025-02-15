package xyz.fabiodamico.fizzbuzz;

public class FizzBuzzRule implements Rule {
    @Override
    public boolean appliesTo(int number) {
        return number % 3 == 0 && number % 5 == 0;
    }

    @Override
    public String getResult() {
        return "FizzBuzz";
    }
}
