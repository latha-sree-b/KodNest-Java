import java.util.*;
public class Program2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the array");
        int n= sc.nextInt();
        int[] arr=new int[n];
         System.out.print("Enter the value: ");
        for(int i=0;i<=n-1;i++){
            arr[i]=sc.nextInt();
        }
            System.out.print("The array is: "+" ");
            for (int i=0;i<=n-1;i++){
                System.out.println(arr[i]+" ");
            }
        
        System.out.println("The reverse array is: "+" ");
        for(int i=n-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }  
    }

}