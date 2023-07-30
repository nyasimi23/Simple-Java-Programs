import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Calculate and display the sum
        double sum = num1 + num2;
        System.out.println("Sum: " + sum);

        // Calculate and display the difference
        double difference = num1 - num2;
        System.out.println("Difference: " + difference);

        // Check for division by zero
        if (num2 != 0) {
            // Calculate and display the division
            double division = num1 / num2;
            System.out.println("Division: " + division);
        } else {
            System.out.println("Division by zero is not allowed.");
        }

        // Calculate and display the product
        double product = num1 * num2;
        System.out.println("Product: " + product);

        scanner.close();
    }
}
