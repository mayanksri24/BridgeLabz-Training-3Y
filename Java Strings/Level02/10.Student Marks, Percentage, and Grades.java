
import java.util.Random;
import java.util.Scanner;

public class StudentScorecardDemo {

    // Generate random PCM scores for n students
    public static int[][] generateScores(int n) {
        Random rand = new Random();
        int[][] scores = new int[n][3];
        for (int i = 0; i < n; i++) {
            scores[i][0] = 40 + rand.nextInt(61); // Physics
            scores[i][1] = 40 + rand.nextInt(61); // Chemistry
            scores[i][2] = 40 + rand.nextInt(61); // Math
        }
        return scores;
    }

    // Calculate total, average, percentage
    public static double[][] calculate(int[][] scores) {
        double[][] result = new double[scores.length][3]; // total, avg, %
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double percent = (total / 300.0) * 100;
            result[i][0] = total;
            result[i][1] = Math.round(avg * 100.0) / 100.0;
            result[i][2] = Math.round(percent * 100.0) / 100.0;
        }
        return result;
    }

    // Assign grade
    public static String[] assignGrades(double[][] result) {
        String[] grades = new String[result.length];
        for (int i = 0; i < result.length; i++) {
            double percent = result[i][2];
            if (percent >= 90) grades[i] = "A+";
            else if (percent >= 80) grades[i] = "A";
            else if (percent >= 70) grades[i] = "B";
            else if (percent >= 60) grades[i] = "C";
            else if (percent >= 50) grades[i] = "D";
            else grades[i] = "F";
        }
        return grades;
    }

    // Display scorecard
    public static void display(int[][] scores, double[][] result, String[] grades) {
        System.out.printf("%-5s %-8s %-10s %-8s %-8s %-8s %-10s %-6s\n",
                "ID", "Physics", "Chemistry", "Math", "Total", "Average", "Percent", "Grade");
        System.out.println("--------------------------------------------------------------------------");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-5d %-8d %-10d %-8d %-8.0f %-8.2f %-10.2f %-6s\n",
                    (i + 1), scores[i][0], scores[i][1], scores[i][2],
                    result[i][0], result[i][1], result[i][2], grades[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] scores = generateScores(n);
        double[][] result = calculate(scores);
        String[] grades = assignGrades(result);

        System.out.println("\nStudent Scorecard:");
        display(scores, result, grades);

        sc.close();
    }
}
