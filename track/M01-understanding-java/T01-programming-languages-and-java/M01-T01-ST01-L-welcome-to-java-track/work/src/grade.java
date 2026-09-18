public class grade {

    public static void main(String[] args) {
        int marks = 76;

        // Display the correct grade using ternary operators
        String grade = (marks >= 80) ? "Grade: A" :(marks >= 60) ? "Grade: B" :(marks >= 40) ? "Grade: C" : "Grade: Fail";
        System.out.println(grade);
    }
}
