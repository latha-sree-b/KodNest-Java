import java.util.*;
public class evenorodd{
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            int n=sc.nextInt();
            if(n%2==0){
                System.out.println("even");
            }
            else{
                System.out.println("odd");
            }
        }
    }
    
}