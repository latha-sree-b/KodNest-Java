/* Write a Java program that accepts a student's marks in 5 subjects and calculates the total marks and percentage.
Using only ternary operators for decision-making, display:
"Invalid Marks" if any subject mark is less than 0 or greater than 100. Otherwise, calculate the percentage and display:
"Fail" if percentage < 40
"Pass" if percentage is 40-59
"First Class" if percentage is 60-74
"Distinction" if percentage is 75 or above
Additionally, display whether the student is eligible for scholarship:
Scholarship = "Eligible" if percentage ≥ 85 and every subject mark is ≥ 75
Otherwise = "Not Eligible"
*/
public class Mrks
{
    public static void main(String[] args)
    {
        int marks1 = 80;
        int marks2 = 70;
        int marks3 = 60;
        int marks4 = 50;
        int marks5 = 40;

        int total = marks1 + marks2 + marks3 + marks4 + marks5;

        double percentage = (total / 500.0) * 100;

        // Corrected syntax using >= and <=
        boolean valid = (marks1 >= 0 && marks1 <= 100) &&
                        (marks2 >= 0 && marks2 <= 100) &&
                        (marks3 >= 0 && marks3 <= 100) &&
                        (marks4 >= 0 && marks4 <= 100) &&
                        (marks5 >= 0 && marks5 <= 100);
        String res = percentage < 40 ? "Fail" : percentage < 60 ? "Pass" : percentage < 75 ? "First class" : "Distinction";

        System.out.println(res);
    }
}
