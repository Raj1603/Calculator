
import java.util.Scanner;

public class Calculator {

    // Addition method
    public static int add(int a, int b) {
        return a + b;
    }

    // Subtraction method
    public static int subtract(int a, int b) {
        return a - b;
    }

    // Multiplication method
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Division method (returns double)
    public static double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is undefined.");
            return Double.NaN;  // Return NaN in case of division by zero
        }
        return (double) a / b;  // Cast the result to double
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n=== Simple Calculator ===");
            System.out.println("Choose operation: +  -  *  /");
            System.out.println("Type 'exit' to quit.");
            System.out.print("Enter operation: ");
            String operation = scanner.next();

            if (operation.equalsIgnoreCase("exit")) {
                running = false;
                System.out.println("Calculator exited.");
                break;
            }

            // Input numbers
            System.out.print("Enter first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();

            // Declare result variable as double to handle division cases
            double result = 0;

            // Perform selected operation
            switch (operation) {
                case "+":
                    result = add(num1, num2);
                    break;
                case "-":
                    result = subtract(num1, num2);
                    break;
                case "*":
                    result = multiply(num1, num2);
                    break;
                case "/":
                    result = divide(num1, num2);
                    break;
                default:
                    System.out.println("Invalid operation. Please try again.");
                    continue;
            }

            // Print result with a check for NaN
            if (Double.isNaN(result)) {
                System.out.println("Cannot perform operation due to division by zero.");
            } else {
                System.out.println("Result: " + result);
            }
        }

        scanner.close();
    }
}
