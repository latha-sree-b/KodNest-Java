import java.util.Scanner;
public class ticketMovie {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter true or false if ticket is present");
        // 1. Declare and initialize variables
        boolean ticketPresent = sc.nextBoolean();
        System.out.println("Enter your age");
        int age = sc.nextInt();

        // 2. Conditional checks
        if (ticketPresent && age >= 18) {
            System.out.println("Watch Movie");
        } else if (!ticketPresent && age >= 18) {
            System.out.println("Buy Ticket and watch movie");
        } else {
            System.out.println("To young to watch movie.");
        }
        sc.close();
    }
}