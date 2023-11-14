import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateWordCounter {
    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Get a string from the user
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Close the Scanner to avoid resource leaks
        scanner.close();

        // Count the number of duplicate words
        Map<String, Integer> wordCountMap = countDuplicateWords(inputString);

        // Display the result
        System.out.println("Duplicate Words and their Count:");
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    // Method to count duplicate words in a string
    private static Map<String, Integer> countDuplicateWords(String str) {
        // Remove punctuation and convert the string to lowercase
        String cleanedString = str.replaceAll("[^a-zA-Z ]", "").toLowerCase();

        // Split the string into words
        String[] words = cleanedString.split("\\s+");

        // Create a Map to store word frequency
        Map<String, Integer> wordFrequencyMap = new HashMap<>();

        // Iterate through each word
        for (String word : words) {
            // Update the word frequency in the map
            wordFrequencyMap.put(word, wordFrequencyMap.getOrDefault(word, 0) + 1);
        }

        // Create a new Map for duplicate words
        Map<String, Integer> duplicateWordsMap = new HashMap<>();

        // Iterate through the word frequency map and add duplicates to the duplicateWordsMap
        for (Map.Entry<String, Integer> entry : wordFrequencyMap.entrySet()) {
            if (entry.getValue() > 1) {
                duplicateWordsMap.put(entry.getKey(), entry.getValue());
            }
        }

        return duplicateWordsMap;
    }
}
