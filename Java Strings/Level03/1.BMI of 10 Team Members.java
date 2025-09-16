
import java.util.Scanner;

public class BMICalculatorDemo {

    // Method to calculate BMI and status
    public static String[][] calculateBMI(double[][] hw) {
        String[][] result = new String[hw.length][4]; // Height, Weight, BMI, Status

        for (int i = 0; i < hw.length; i++) {
            double weight = hw[i][0];
            double heightCm = hw[i][1];
            double heightM = heightCm / 100.0;

            double bmi = weight / (heightM * heightM);
            String status;
            if (bmi < 18.5) status = "Underweight";
            else if (bmi < 25) status = "Normal";
            else if (bmi < 30) status = "Overweight";
            else status = "Obese";

            result[i][0] = String.valueOf(weight);
            result[i][1] = String.valueOf(heightCm);
            result[i][2] = String.format("%.2f", bmi);
            result[i][3] = status;
        }
        return result;
    }

    // Method to display results
    public static void display(String[][] data) {
        System.out.printf("%-8s %-8s %-8s %-12s\n", "Weight", "Height", "BMI", "Status");
        System.out.println("------------------------------------");
        for (String[] row : data) {
            System.out.printf("%-8s %-8s %-8s %-12s\n", row[0], row[1], row[2], row[3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] hw = new double[10][2]; // 10 persons, [weight, height]

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            hw[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            hw[i][1] = sc.nextDouble();
        }

        String[][] results = calculateBMI(hw);
        System.out.println("\nBMI Report:");
        display(results);

        sc.close();
    }
}
