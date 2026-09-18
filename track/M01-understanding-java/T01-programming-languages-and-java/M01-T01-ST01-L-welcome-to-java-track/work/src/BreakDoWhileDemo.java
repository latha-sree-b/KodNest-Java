public class BreakDoWhileDemo {
    public static void main(String[] args) {
        int b = 1;
        do {
            if (b == 3) {
                System.out.println("   --> Break triggered at b = " + b);
                break; // Terminates the loop immediately
            }
            System.out.println("Value of b: " + b);
            b++;
        } while (b <= 5);
        System.out.println("Loop finished.");
    }
}