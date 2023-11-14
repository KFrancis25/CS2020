import java.util.*;

public class NameProcessor {
    public static void main(String[] args) {
        // Create a list of first names
        List<String> firstNameList = Arrays.asList("John", "Alice", "Bob", "John", "Charlie", "Alice");

        // Eliminate duplicates by moving the names to a Set
        Set<String> uniqueNamesSet = new HashSet<>(firstNameList);

        // Display unique names
        System.out.println("Unique Names: " + uniqueNamesSet);

        // Allow the user to search for names
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name to search: ");
        String searchName = scanner.nextLine();

        // Check if the entered name is in the set
        if (uniqueNamesSet.contains(searchName)) {
            System.out.println(searchName + " is found in the list.");
        } else {
            System.out.println(searchName + " is not found in the list.");
        }

        // Close the Scanner to avoid resource leaks
        scanner.close();
    }
}
