import java.util.Scanner;

public class GradeSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your marks: ");
        int marks = scanner.nextInt();
        scanner.close();

        String grade = calculateGrade(marks);
        System.out.println("Your grade is: " + grade);
    }

    public static String calculateGrade(int marks) {
        if (marks < 25) {
            return "F";
        } else if (marks >= 25 && marks < 45) {
            return "E";
        } else if (marks >= 45 && marks < 50) {
            return "D";
        } else if (marks >= 50 && marks < 60) {
            return "C";
        } else if (marks >= 60 && marks < 80) {
            return "B";
        } else {
            return "A";
        }
    }
}
