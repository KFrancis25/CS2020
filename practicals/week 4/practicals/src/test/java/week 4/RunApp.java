import java.util.Scanner;

public class RunApp {
    private Calculator calculator; // Calculator instance

    public RunApp(Calculator calculator) {
        this.calculator = calculator;
    }

    private void parseOperators(int num1) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            // Get the operator (+, -, or *)
            System.out.print("Enter the operator (+, -, *): ");
            String operator = scanner.nextLine();

            // Check if the user wants to exit
            if (operator.equalsIgnoreCase("exit")) {
                System.out.println("Goodbye!");
                scanner.close();
                return;
            }

            if (operator.equals("+") || operator.equals("-") || operator.equals("*")) {
                // Get the second number
                System.out.print("Enter the second number: ");
                String input = scanner.nextLine();

                // Check if the user wants to exit
                if (input.equalsIgnoreCase("exit")) {
                    System.out.println("Goodbye!");
                    scanner.close();
                    return;
                }

                try {
                    int num2 = Integer.parseInt(input);
                    int result = 0;

                    // Perform the calculation based on the operator
                    switch (operator) {
                        case "+":
                            result = calculator.add(num1, num2);
                            break;
                        case "-":
                            result = calculator.subtract(num1, num2);
                            break;
                        case "*":
                            result = calculator.multiply(num1, num2);
                            break;
                    }

                    // Display the result with the calculator version
                    System.out.println("Result: " + result);
                    System.out.println("Calculated using " + calculator.getVersion());
                    return;
                } catch (NumberFormatException e) {
                    System.out.println("Error: Please enter a valid number for the second number.");
                }
            } else {
                System.out.println("Invalid operator. Please use +, -, or *.");
            }
        }
    }

    public static void main(String[] args) {
        // Create a Calculator instance with a version
        Calculator calculator = new Calculator("Magic Calculator v1.0");
        RunApp runApp = new RunApp(calculator);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Calculator App!");
        System.out.println("Enter 'exit' at any time to quit.");

        while (true) {
            // Get the first number
            System.out.print("Enter the first number: ");
            String input = scanner.nextLine();

            // Check if the user wants to exit
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Goodbye!");
                break;
            }

            try {
                int num1 = Integer.parseInt(input);
                runApp.parseOperators(num1);
            } catch (NumberFormatException e) {
                System.out.println("Error: Please enter a valid number for the first number.");
            }
        }

        scanner.close();
    }
}
