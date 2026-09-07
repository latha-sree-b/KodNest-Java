import java.util.*;
public class primenumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n=sc.nextInt();
            for(int i=2;i<n;i++){
                if(n%i==0){
                    System.out.println("not a prime");
                    return;
                }
            }
            System.out.println("prime");
        }
    }
}
