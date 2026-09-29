import java.util.*;
public class s{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create one Student object
        student s = new student();
        student s1=new student();

        System.out.println("Enter student 1 details");
        System.out.print("ID:");
        s.id = scanner.nextInt();
        System.out.print("Name:");
        s.name = scanner.next();
        System.out.print("Course:");
        s.course = scanner.next();
        System.out.print("Java Score:");
        s.javaScore = scanner.nextDouble();

        System.out.println("Enter student 2 details");
        System.out.print("ID:");
        s1.id = scanner.nextInt();
        System.out.print("Name:");
        s1.name = scanner.next();
        System.out.print("Course:");
        s1.course = scanner.next();
        System.out.print("Java Score:");
        s1.javaScore = scanner.nextDouble();

        // Display the stored details
        System.out.println("Student1 Profile");
        System.out.println("ID: " + s.id);
        System.out.println("Name: " + s.name);
        System.out.println("Course: " + s.course);
        System.out.println("Java Score: " + s.javaScore);
        
        System.out.println("Student2 Profile");
        System.out.println("ID: " + s1.id);
        System.out.println("Name: " + s1.name);
        System.out.println("Course: " + s1.course);
        System.out.println("Java Score: " + s1.javaScore);
    }
} 