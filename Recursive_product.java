import java.util.Scanner;

public class RecursiveProduct {

    // This is the recursive method that help in calculating the product of an array of numbers
    public static double recursiveProduct(double[] numbers, int index) {
        // Base case: if we reach the last element, return it
        if (index == numbers.length) {
            return 1;
        }
        // The recursive case where we can multiply the current number by the product of the remaining numbers
        return numbers[index] * recursiveProduct(numbers, index + 1);
    }

    // Method helps to get user input
    public static double[] getUserInput() {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[5];
        for (int i = 0; i < 5; i++) {
            while (true) {
                try {
                    System.out.print("Enter number " + (i + 1) + ": ");
                    numbers[i] = Double.parseDouble(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Please enter a valid number.");
                }
            }
        }
        return numbers;
    }

    // Main method (this is the main method of the program)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter five numbers to calculate their product.");
            double[] numbers = getUserInput();
            double result = recursiveProduct(numbers, 0);
            System.out.println("The product of the numbers is: " + result);

            // Ask user if they want to continue or end (we can be able to control the program, either we end it or continue with new data)
            System.out.print("Do you want to continue? (yes/no): ");
            String response = scanner.nextLine();
            if (response.equalsIgnoreCase("no")) {
                break;
            }
        }
    }
}
