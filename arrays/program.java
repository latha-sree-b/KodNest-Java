import java.util.*;
public class program{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        int[] arr=new int[n];
    
        for(int i=0;i<=n-1;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            count =count+arr[i];

        }
        System.out.println(count);
        sc.close();
    }
}