import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for temperature in Celsius
        System.out.print("Enter the temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        // Convert Celsius to Fahrenheit
        double fahrenheit = (celsius * 9 / 5) + 32;

        // Print the result
        System.out.println("The temperature in Fahrenheit is: " + fahrenheit);

        // Close the scanner
        scanner.close();
    }
}

