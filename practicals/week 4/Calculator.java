public class Calculator {
    private String version; // Global variable to store the calculator version

    public Calculator(String version) {
        this.version = version;
    }

    // Method to add two integers
    public int add(int num1, int num2) {
        if (num1 < 0 || num1 > 60 || num2 < 0 || num2 > 60) {
            throw new IllegalArgumentException("This calculator can work only with numbers in the range 0-60.");
        }
        return num1 + num2;
    }

    // Method to subtract two integers
    public int subtract(int num1, int num2) {
        if (num1 < 0 || num1 > 60 || num2 < 0 || num2 > 60) {
            throw new IllegalArgumentException("This calculator can work only with numbers in the range 0-60.");
        }
        return num1 - num2;
    }

    // Method to multiply two integers
    public int multiply(int num1, int num2) {
        if (num1 < 0 || num1 > 60 || num2 < 0 || num2 > 60) {
            throw new IllegalArgumentException("This calculator can work only with numbers in the range 0-60.");
        }
        return num1 * num2;
    }

    // Getter for the calculator version
    public String getVersion() {
        return version;
    }
}
