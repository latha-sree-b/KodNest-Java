public class ContinuteWhileDemo {
    public static void main(String[] args) {
        int c = 1;
        while (c <= 5) {
            if (c == 3) {
                System.out.println("   --> Skipping c = " + c);
                c++; // Increment before continue to avoid an infinite loop
                continue; // Jumps to condition check
            }
            System.out.println("Value of c: " + c);
            c++;
        }
        System.out.println("Loop finished.");
    }
}
