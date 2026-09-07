import java.util.*;
public class eligibletoVoe {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            int age=sc.nextInt();
            if(age>=18){
                System.out.println("eligible to vote");
            }
            else{
                System.out.println("not eligible to vote");
            }
        }
    }
    
}