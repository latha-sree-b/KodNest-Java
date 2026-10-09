import java.util.*;
public class amstrong{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        int temp=n;
        int sum=0;
        while(n>0){
            int r=n%10;
            sum=sum+(r*r*r);
            n=n/10;
        }
        if(sum==temp){
            System.out.println("The number is an amstrong number");
        }
        else{
            System.out.println("The number is not an amstrong number");
        }
    }
}