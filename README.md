# FizzBuzz kata with a twist

This repository contains an implementation of the classic FizzBuzz kata with a focus on Test-Driven Development (TDD) and the Open/Closed Principle (OCP). It serves as an excellent exercise for pair programming interviews, demonstrating both fundamental coding practices and object-oriented design principles.

## The Challenge

FizzBuzz is a simple programming task: Write a function that takes a number and returns:
- "Fizz" for numbers divisible by 3
- "Buzz" for numbers divisible by 5
- "FizzBuzz" for numbers divisible by both 3 and 5
- The number itself for other cases

## The Twist

While the basic FizzBuzz is straightforward, this implementation adds an architectural twist by applying the Open/Closed Principle. The solution is designed to be:
- Open for extension (new rules can be added without modifying existing code)
- Closed for modification (existing rules don't need to change to accommodate new ones)

## Key Features

- Test-Driven Development approach with incremental test cases
- Rule-based architecture following the Open/Closed Principle
- Easy to extend with new rules (e.g., "Whizz" for multiples of 7)
- Clean separation of concerns
- Java Streams for elegant rule processing

## Perfect for Interviews

This kata is particularly useful for pair programming interviews because it:
1. Starts simple but allows for complexity
2. Demonstrates TDD practices
3. Shows understanding of SOLID principles
4. Provides opportunities for discussion about design choices
5. Can be extended in multiple ways during the session

## Getting Started

1. Clone the repository
2. Open in your favorite Java IDE
3. Run the tests to see the implementation in action
4. Try adding new rules to extend the functionality

## Example Usage

```java
FizzBuzzGame game = new FizzBuzzGame();
game.play(1);  // Returns: "1"
game.play(3);  // Returns: "Fizz"
game.play(5);  // Returns: "Buzz"
game.play(15); // Returns: "FizzBuzz"
```

## Extending the Solution

The implementation can be easily extended by adding new rules. For example, to add a "Whizz" rule for multiples of 7:

```java
class WhizzRule implements Rule {
    @Override
    public boolean applies(int number) {
        return number % 7 == 0;
    }
    
    @Override
    public String getResult() {
        return "Whizz";
    }
}
```

## License

MIT

Feel free to use this kata in your interviews or learning exercises!