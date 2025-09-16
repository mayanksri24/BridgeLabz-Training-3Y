import java.util.Scanner;

public class BMICalculator2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        double[][] personData = new double[n][3]; // [weight, height, BMI]
        String[] weightStatus = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nPerson " + (i + 1) + ": ");
            
            double w, h;
            while (true) {
                System.out.print("Enter weight (kg): ");
                w = sc.nextDouble();
                System.out.print("Enter height (m): ");
                h = sc.nextDouble();
                if (w > 0 && h > 0) break;
                System.out.println("Invalid input. Please enter positive values.");
            }

            personData[i][0] = w;
            personData[i][1] = h;
            personData[i][2] = w / (h * h);

            double bmi = personData[i][2];
            if (bmi <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmi <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmi <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        System.out.println("\n--- BMI Report ---");
        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i + 1) +
                               " | Weight: " + personData[i][0] + " kg" +
                               " | Height: " + personData[i][1] + " m" +
                               " | BMI: " + String.format("%.2f", personData[i][2]) +
                               " | Status: " + weightStatus[i]);
        }

        sc.close();
    }
}
