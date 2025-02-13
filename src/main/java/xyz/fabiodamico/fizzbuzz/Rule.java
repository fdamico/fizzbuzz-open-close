package xyz.fabiodamico.fizzbuzz;

public interface Rule {
    boolean appliesTo(int number);
    String getResult();
}
