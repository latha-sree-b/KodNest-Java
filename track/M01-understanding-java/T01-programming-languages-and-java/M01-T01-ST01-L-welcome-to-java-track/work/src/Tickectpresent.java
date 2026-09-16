import java.util.Scanner;

public class Tickectpresent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ticketInput;
        int age;
        
        System.out.println("Enter yes or no if your ticket is present");
        ticketInput = sc.next();
        
        System.out.println("Enter your age");
        age = sc.nextInt();
        
        // Checking if the input equals "yes" (ignoring case)
        if (ticketInput.equalsIgnoreCase("yes")) {
            System.out.println("Ticket is present");
            if (age >= 18) {
                System.out.println("Watch Movie");
            } else {
                System.out.println("You're too young to watch a movie");
            }
        } else {
            System.out.println("Buy Ticket and watch movie");
        }
        
        sc.close(); // Good practice to close the scanner
    }
}