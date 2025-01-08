import java.util.Scanner;

public class Fifth {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the radius of the cylinder
        System.out.print("Enter the radius of the cylinder: ");
        double radius = scanner.nextDouble();

        // Prompt the user for the height of the cylinder
        System.out.print("Enter the height of the cylinder: ");
        double height = scanner.nextDouble();

        // Calculate the volume of the cylinder
        double volume = Math.PI * Math.pow(radius, 2) * height;

        // Print the result
        System.out.println("The volume of the cylinder is: " + volume);

        // Close the scanner
        scanner.close();
    }
}
