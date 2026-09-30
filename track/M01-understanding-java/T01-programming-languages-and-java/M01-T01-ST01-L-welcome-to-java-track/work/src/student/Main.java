import java.util.Scanner;
    public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // First student object
        Student1 firstStudent = new Student1();
        firstStudent.id = scanner.nextInt();
        firstStudent.name = scanner.next();
        firstStudent.javaScore = scanner.nextInt();

        // Second student object
        Student1 secondStudent = new Student1();
        secondStudent.id = scanner.nextInt();
        secondStudent.name = scanner.next();
        secondStudent.javaScore = scanner.nextInt();

        // Print both records
        System.out.println(firstStudent.id + " - " + firstStudent.name + " - " + firstStudent.javaScore);
        System.out.println(secondStudent.id + " - " + secondStudent.name + " - " + secondStudent.javaScore);

        // Compare scores and print result
        if (firstStudent.javaScore > secondStudent.javaScore) {
            System.out.println(firstStudent.name + " has the higher Java score.");
        } else if (secondStudent.javaScore > firstStudent.javaScore) {
            System.out.println(secondStudent.name + " has the higher Java score.");
        } else {
            System.out.println("Both students have the same Java score.");
        }
    }
}
    

