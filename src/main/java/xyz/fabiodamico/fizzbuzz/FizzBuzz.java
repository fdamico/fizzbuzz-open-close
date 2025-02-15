package xyz.fabiodamico.fizzbuzz;

import java.util.List;

public class FizzBuzz {

    private final List<Rule> rules = List.of(
            new FizzBuzzRule(),
            new FizzRule(),
            new BuzzRule());

    public String play(int input) {
        String result = rules.stream()
                .filter(rule -> rule.appliesTo(input))
                .findFirst()
                .map(Rule::getResult)
                .orElse(String.valueOf(input));

        return result.isEmpty() ? String.valueOf(input) : result;
    }
}
