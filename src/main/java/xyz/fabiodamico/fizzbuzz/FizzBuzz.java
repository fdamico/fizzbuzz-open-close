package xyz.fabiodamico.fizzbuzz;

import java.util.List;
import java.util.stream.Collectors;

public class FizzBuzz {

    private final List<Rule> rules = List.of(new FizzRule(), new BuzzRule());

    public String play(int input) {
        String result = rules.stream()
                .filter(rule -> rule.appliesTo(input))
                .map(Rule::getResult)
                .collect(Collectors.joining());

        return result.isEmpty() ? String.valueOf(input) : result;
    }
}
