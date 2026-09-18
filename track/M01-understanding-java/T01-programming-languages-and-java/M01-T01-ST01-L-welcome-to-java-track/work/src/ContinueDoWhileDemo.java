public class ContinueDoWhileDemo {
    public static void main(String[] args) {
        int d = 1;
        do {
            if (d == 3) {
                System.out.println("   --> Skipping d = " + d);
                d++; // Increment before continue to avoid an infinite loop
                continue; // Jumps to condition check
            }
            System.out.println("Value of d: " + d);
            d++;
        } while (d <= 5);
        System.out.println("Loop finished.");
    }
}
