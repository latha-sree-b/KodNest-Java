import java.util.Scanner;
public class SumScanner {
    public static void main(String[] args) {
        // Create a Scanner object within try-with-resources to automatically close it
        try (Scanner sc = new Scanner(System.in)) {
            // Read the first integer from the user and store it in variable 'a'.
            int a = sc.nextInt();
            // Read the second integer from the user and store it in variable 'b'.
            int b = sc.nextInt();
            // Calculate the sum of 'a' and 'b' and print the result.
            System.out.println("sum of a+b is " + (a + b));
        }
    }
}
