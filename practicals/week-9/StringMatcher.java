import java.util.Scanner;

public class StringMatcher {
    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Get the first string from the user
        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();

        // Get the second string from the user
        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine();

        // Close the Scanner to avoid resource leaks
        scanner.close();

        // Check if there is a match in any part of the strings, ignoring case
        if (checkForMatch(firstString, secondString)) {
            System.out.println("The strings have a match in some part.");
        } else {
            System.out.println("No match found in any part of the strings.");
        }
    }

    // Method to check for a match in any part of the strings, ignoring case
    private static boolean checkForMatch(String str1, String str2) {
        // Define the starting index for comparison in both strings (here, starting from index 0)
        int startIndex = 0;

        // Define the length of the substring for comparison (here, using the length of the shorter string)
        int length = Math.min(str1.length(), str2.length());

        // Use regionMatches to compare the substrings, ignoring case
        return str1.regionMatches(true, startIndex, str2, startIndex, length);
    }
}
