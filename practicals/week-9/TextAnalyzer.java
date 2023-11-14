import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TextAnalyzer {
    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Get a line of text from the user
        System.out.print("Enter a line of text: ");
        String inputText = scanner.nextLine();

        // Close the Scanner to avoid resource leaks
        scanner.close();

        // Analyze and print letter frequency
        printLetterFrequency(inputText);

        // Analyze and print word frequency
        printWordFrequency(inputText);
    }

    // Method to print letter frequency
    private static void printLetterFrequency(String text) {
        // Create a Map to store letter frequency
        Map<Character, Integer> letterFrequencyMap = new HashMap<>();

        // Iterate through each character in the text
        for (char ch : text.toCharArray()) {
            // Ignore non-alphabetic characters
            if (Character.isLetter(ch)) {
                // Convert to lowercase to treat 'A' and 'a' as the same
                ch = Character.toLowerCase(ch);

                // Update the letter frequency in the map
                letterFrequencyMap.put(ch, letterFrequencyMap.getOrDefault(ch, 0) + 1);
            }
        }

        // Print the letter frequency table
        System.out.println("Letter Frequency:");
        for (Map.Entry<Character, Integer> entry : letterFrequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println();
    }

    // Method to print word frequency
    private static void printWordFrequency(String text) {
        // Create a Map to store word frequency
        Map<Integer, Integer> wordFrequencyMap = new HashMap<>();

        // Split the text into words
        String[] words = text.split("\\s+");

        // Iterate through each word
        for (String word : words) {
            // Update the word frequency in the map
            int wordLength = word.length();
            wordFrequencyMap.put(wordLength, wordFrequencyMap.getOrDefault(wordLength, 0) + 1);
        }

        // Print the word frequency table
        System.out.println("Word Frequency:");
        for (Map.Entry<Integer, Integer> entry : wordFrequencyMap.entrySet()) {
            System.out.println(entry.getKey() + "-letter words: " + entry.getValue());
        }
    }
}
