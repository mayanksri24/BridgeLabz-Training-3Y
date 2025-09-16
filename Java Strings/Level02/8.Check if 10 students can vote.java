
import java.util.Random;
import java.util.Scanner;

public class StudentVotingDemo {

    // Method to generate random ages for n students
    public static int[] generateAges(int n) {
        Random rand = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = 10 + rand.nextInt(90); // random 2-digit age
        }
        return ages;
    }

    // Method to check voting eligibility
    public static String[][] checkVoting(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) {
                result[i][1] = "Invalid Age";
            } else if (ages[i] >= 18) {
                result[i][1] = "Can Vote";
            } else {
                result[i][1] = "Cannot Vote";
            }
        }
        return result;
    }

    // Method to display results
    public static void display(String[][] data) {
        System.out.printf("%-10s %-15s\n", "Age", "Eligibility");
        System.out.println("--------------------------");
        for (String[] row : data) {
            System.out.printf("%-10s %-15s\n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] ages = generateAges(n);
        String[][] results = checkVoting(ages);

        System.out.println("\nVoting Eligibility Results:");
        display(results);

        sc.close();
    }
}
