import java.util.Scanner;

public class DivideTwoIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter dividend (integer): ");
        int dividend = input.nextInt();

        System.out.print("Enter divisor (integer): ");
        int divisor = input.nextInt();
        input.close();

        if (divisor == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return;
        }

        // Integer division (truncates toward zero)
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        // Floating-point result
        double preciseResult = (double) dividend / divisor;

        System.out.println("\nResults:");
        System.out.println("Integer quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
        System.out.printf("Floating‑point result: %.4f%n", preciseResult);
    }
}
