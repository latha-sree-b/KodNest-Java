import java.util.*;
public class student{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int student = sc.nextInt();
        int classes = sc.nextInt();
        int[][] precentage = new int[student][classes];
        for(int i = 0; i < student; i++){
            for(int j = 0; j < classes; j++){
                precentage[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < student; i++){
            for(int j = 0; j < classes; j++){
                System.out.print(precentage[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}