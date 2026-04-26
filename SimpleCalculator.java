import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Simple Calculator");
            System.out.println("Choose an operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            if (choice == 5) {
                System.out.println("Exiting the calculator. Goodbye!");
                break;
            }

            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            switch (choice) {
                case 1:
                    System.out.printf("Result: %.2f%n", (num1 + num2));
                    break;
                case 2:
                    System.out.printf("Result: %.2f%n", (num1 - num2));
                    break;
                case 3:
                    System.out.printf("Result: %.2f%n", (num1 * num2));
                    break;
                case 4:
                    if (num2 != 0) {
                        System.out.printf("Result: %.2f%n", (num1 / num2));
                    } else {
                        System.out.println("Error: Division by zero.");
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
            System.out.println(); // Add an empty line for better readability
        }
        scanner.close();
    }
}