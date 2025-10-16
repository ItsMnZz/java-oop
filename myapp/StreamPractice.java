package myapp;

import java.util.*;
import java.util.stream.Collectors;

public class StreamPractice {

    public static void main(String[] args) {
        StreamPractice sp = new StreamPractice();

        System.out.println("1️⃣ Odd Numbers: " + sp.getOddNumbers(Arrays.asList(1, 2, 3, 4, 5, 6)));
        System.out.println("2️⃣ Longest Word: " + sp.findLongestWord(Arrays.asList("apple", "banana", "cherry", "kiwi")));
        System.out.println("3️⃣ Names starting with A: " + sp.countNamesStartingWithA(Arrays.asList("Amy", "Alex", "Bob", "Andrew")));
        System.out.println("4️⃣ Max Number: " + sp.findMaxNumber(Arrays.asList(3, 8, 12, 5, 9)));
        System.out.println("5️⃣ Word Count: " + sp.countWords("Java Streams make coding more fun and clean"));
        System.out.println("6️⃣ Multiply by 10: " + sp.multiplyByTen(Arrays.asList(2, 4, 6, 8)));
        System.out.println("7️⃣ Join Words: " + sp.joinWords(Arrays.asList("Streams", "are", "awesome")));
    }

    // 🧠 1. Get all odd numbers from a list and return as List<Integer>
    public List<Integer> getOddNumbers(List<Integer> numbers) {

        List<Integer> oddNumbers = numbers.stream()
                .filter(number -> number % 2 != 0)
                .toList();

        return oddNumbers;

    }

    // 🧠 2. Find the longest word in a list of strings
    public Optional<String> findLongestWord(List<String> words) {

        Optional<String> longestWord = words.stream().max(Comparator.comparingInt(String::length)); 

        return longestWord;
    }

    // 🧠 3. Count how many names start with the letter "A"
    public long countNamesStartingWithA(List<String> names) {
        // TODO: use filter() and count()

        long count = names.stream().
                filter(name -> name.toUpperCase().startsWith("A")).
                count();

        return count;
    }

    // 🧠 4. Find the maximum number in a list
    public Optional<Integer> findMaxNumber(List<Integer> numbers) {
        // TODO: use max() with Integer::compare
        // Hint: .orElse(0) for default
        Optional<Integer> maxNumber = numbers.stream().max(Comparator.naturalOrder());

        return maxNumber;
    }

    // 🧠 5. Count how many words a sentence has
    public long countWords(String sentence) {

        String[] words = sentence.split(" ");
        List<String> wordsList = Arrays.asList(words);

        long count = wordsList.stream().count();

        return count;
    }

    // 🧠 6. Multiply each number by 10 and return new list
    public List<Integer> multiplyByTen(List<Integer> numbers) {

        List<Integer> newNumbers = numbers.stream()
                .map(number -> number * 10)
                .toList();

        return newNumbers;

    }

    // 🧠 7. Join all strings into one sentence
    public String joinWords(List<String> words) {
        return words.stream()
                .collect(Collectors.joining(" "));
    }
}
