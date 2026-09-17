public class TernaryOperator{
    public static void main(String[] args) {
        int a = 20, b = 30, c = 40;

        int result = (a > b) ? a : b;
        int max = (result > c) ? result : c;

        System.out.println("The maximum of " + a + ", " + b + ", and " + c + " is: " + max);
    }
}