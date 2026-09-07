import java.util.*;
public class Dollartorupees {
        public static void main(String[] args){
       try(Scanner sc=new Scanner(System.in)){
        double dollar=sc.nextDouble();
        double result=dollar*82.73;
    
        System.out.println("rupees: "+result);
       }
    }
}
