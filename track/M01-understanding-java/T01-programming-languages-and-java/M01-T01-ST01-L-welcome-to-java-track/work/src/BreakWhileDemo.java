public class BreakWhileDemo {
    public static void main(String[] args) {
        int a = 1;
        while (a <= 5) {
            if (a == 3) {
                System.out.println("   --> Break triggered at a = " + a);
                break; // Terminates the loop immediately
            }
            System.out.println("Value of a: " + a);
            a++;
        }
        System.out.println("Loop finished.");
    }
}