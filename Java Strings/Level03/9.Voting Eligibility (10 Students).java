
import java.util.Scanner;

public class VotingEligibility {

    // Method to generate ages of n students
    public static int[] getAges(int n) {
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = 10 + (int)(Math.random() * 15); // random age between 10-24
        }
        return ages;
    }

    // Method to check eligibility and return 2D array
    public static String[][] checkEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) {
                result[i][1] = "false (Invalid)";
            } else if (ages[i] >= 18) {
                result[i][1] = "true";
            } else {
                result[i][1] = "false";
            }
        }
        return result;
    }

    // Method to display results
    public static void display(String[][] data) {
        System.out.println("Age\tCan Vote?");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t" + data[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 10; // fixed as per problem
        int[] ages = getAges(n);

        String[][] eligibility = checkEligibility(ages);

        display(eligibility);

        sc.close();
    }
}
