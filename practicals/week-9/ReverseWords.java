import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Get the string from the user
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Close the Scanner to avoid resource leaks
        scanner.close();

        // Reverse the string
        String reversedString = reverseString(inputString);

        // Display the reversed string
        System.out.println("Reversed String: " + reversedString);
    }

    // Method to reverse a string
    private static String reverseString(String str) {
        // Convert the string to a char array
        char[] charArray = str.toCharArray();

        // Use two pointers to reverse the char array in-place
        int start = 0;
        int end = charArray.length - 1;

        while (start < end) {
            // Swap characters at start and end indices
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;

            // Move the pointers towards the center
            start++;
            end--;
        }

        // Convert the char array back to a string
        return new String(charArray);
    }
}
