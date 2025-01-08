import java.util.Scanner;

public class Eighth {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the base
        System.out.print("Enter the base: ");
        double base = scanner.nextDouble();

        // Prompt the user for the exponent
        System.out.print("Enter the exponent: ");
        double exponent = scanner.nextDouble();

        // Calculate the result using Math.pow
        double result = Math.pow(base, exponent);

        // Print the result
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);

        // Close the scanner
        scanner.close();
    }
}
