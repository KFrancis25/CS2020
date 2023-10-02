//Number 2
import java.util.Scanner;

public class EvenNumbersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the range of numbers from the user
        System.out.print("Enter the starting number: ");
        int start = scanner.nextInt();

        System.out.print("Enter the ending number: ");
        int end = scanner.nextInt();

        // Close the scanner
        scanner.close();

        System.out.println("Even numbers in the range from " + start + " to " + end + ":");
        printEvenNumbersInRange(start, end);
    }

    public static void printEvenNumbersInRange(int start, int end) {
        // Ensure that the start number is even
        if (start % 2 != 0) {
            start++; // If not even, start from the next even number
        }

        for (int i = start; i <= end; i += 2) {
            System.out.println(i);
        }
    }
}



//Number 3
/*
import java.util.Scanner;

public class EvenNumbersInRangeWithMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the range of numbers from the user
        System.out.print("Enter the starting number: ");
        int start = scanner.nextInt();

        System.out.print("Enter the ending number: ");
        int end = scanner.nextInt();

        // Close the scanner
        scanner.close();

        System.out.println("Numbers in the range from " + start + " to " + end + ":");
        printNumbersWithMultiplication(start, end);
    }

    public static void printNumbersWithMultiplication(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (i % 5 == 0 && i % 2 != 0) { // Check if it's the 5th number and not even
                int result = i * 3;
                if (result <= 100) { // Check if the result is less or equal to 100
                    System.out.println(i + " (multiplied by 3 is " + result + ")");
                } else {
                    System.out.println(i + " (multiplied by 3 is greater than 100)");
                }
            } else if (i % 2 == 0) { // Check if it's an even number
                System.out.println(i + " (even)");
            } else {
                System.out.println(i);
            }
        }
    }
}
*/