package main.java;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;


/* To test this in IDEA you need to enable all the aux Java Parameter names Inlay Hints */

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");

        Function<String, Integer> wordLength = (String s) -> s.length();
        Predicate<String> startsWithA = (String s) -> s.startsWith("a");

        // Applying the functional interfaces to the list of words
        List<Integer> wordLengths = mapList(words, wordLength);
        List<String> aWords = filterList(words, startsWithA);

        System.out.println("Word Lengths: " + wordLengths);
        System.out.println("Words starting with 'a': " + aWords);
    }

    // Generic method to apply a Function to each element of a List and return the results
    private static <T, R> List<R> mapList(List<T> list, Function<T, R> function) {
        return list.stream().map(function).toList();
    }

    // Generic method to filter a List based on a Predicate and return the filtered elements
    private static <T> List<T> filterList(List<T> list, Predicate<T> predicate) {
        return list.stream().filter(predicate).toList();
    }
}
