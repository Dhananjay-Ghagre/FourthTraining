import java.util.Scanner;

public class Sixth {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the principal amount
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        // Prompt the user for the rate of interest
        System.out.print("Enter the rate of interest: ");
        double rate = scanner.nextDouble();

        // Prompt the user for the time period
        System.out.print("Enter the time period (in years): ");
        double time = scanner.nextDouble();

        // Calculate the simple interest
        double simpleInterest = (principal * rate * time) / 100;

        // Print the result
        System.out.println("The simple interest is: " + simpleInterest);

        // Close the scanner
        scanner.close();
    }
}
