import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an operation: add, subtract, multiply, divide, or exit");
            String operation = scanner.nextLine();

            if (operation.equals("exit")) {
                break;
            }

            System.out.println("Enter the first number:");
            double a = scanner.nextDouble();
            System.out.println("Enter the second number:");
            double b = scanner.nextDouble();
            scanner.nextLine();  // Clear the newline character from the buffer

            double result;
            switch (operation) {
                case "add":
                    result = calculator.add((int) a, (int) b);
                    System.out.println("Result: " + result);
                    break;
                case "subtract":
                    result = calculator.subtract((int) a, (int) b);
                    System.out.println("Result: " + result);
                    break;
                case "multiply":
                    result = calculator.multiply((int) a, (int) b);
                    System.out.println("Result: " + result);
                    break;
                case "divide":
                    try {
                        result = calculator.divide((int) a, (int) b);
                        System.out.println("Result: " + result);
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                default:
                    System.out.println("Invalid operation. Please try again.");
            }
        }

        scanner.close();
        System.out.println("Calculator closed.");
    }
}