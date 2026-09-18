public class PlacementReadniness {
    public static void main(String[] args) {
        int marks = 68;
        int attendance = 80;
        int practiceDays = 3;

        // Use ternary operator to select status message
        String status = (marks >= 60 && attendance >= 75) ? "Placement Ready" : "Continue Preparation";
        System.out.println(status);

        // Use for loop to print practice days
        for (int day = 1; day <= practiceDays; day++) {
            System.out.println("Practice Day: " + day);
        }
    }
}
