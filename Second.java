import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the first number
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        // Prompt the user for the second number
        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        // Calculate the sum
        int sum = number1 + number2;

        // Print the result
        System.out.println("The sum of " + number1 + " and " + number2 + " is " + sum);

        // Close the scanner
        scanner.close();
    }
}
