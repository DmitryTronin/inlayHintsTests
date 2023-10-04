package main.java;

import java.util.Arrays;
import java.util.List;

public class LambdaExpressionExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        int sumOfSquares = numbers.stream()
                .map(num -> num * num) // complex expressions as arguments
                .reduce(0, (acc, num) -> acc + num); // Lambda expression default

        List<Integer> evenNumbers = numbers.stream()
                .filter(num -> num % 2 == 0) // complex expressions as arguments
                .toList(); //

        System.out.println("Sum of squares: " + sumOfSquares);
        System.out.println("Even numbers: " + evenNumbers);
    }
}
