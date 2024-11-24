import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {
        // Create a scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Input student's name
        System.out.print("Enter student's name: ");
        String studentName = scanner.nextLine();

        // Input the number of subjects
        System.out.print("Enter number of subjects: ");
        int numSubjects = scanner.nextInt();

        // Initialize an array to store the grades of each subject
        double[] grades = new double[numSubjects];
        double totalMarks = 0;

        // Input grades for each subject and calculate total marks
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter grade for subject " + (i + 1) + ": ");
            grades[i] = scanner.nextDouble();
            totalMarks += grades[i]; // Accumulate the total marks
        }

        // Calculate the average marks
        double averageMarks = totalMarks / numSubjects;

        // Determine the grade based on the average score
        String grade;
        if (averageMarks >= 90) {
            grade = "A";
        } else if (averageMarks >= 80) {
            grade = "B";
        } else if (averageMarks >= 70) {
            grade = "C";
        } else if (averageMarks >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        // Display the results
        System.out.println("\nStudent: " + studentName);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + averageMarks);
        System.out.println("Grade: " + grade);

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}