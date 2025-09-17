import java.util.Scanner;

public class EuclideanLine {

    // Method to calculate Euclidean distance
    static double euclideanDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // Method to calculate slope (m) and intercept (b) of line
    static double[] lineEquation(int x1, int y1, int x2, int y2) {
        if (x1 == x2) {
            throw new ArithmeticException("Vertical line: slope is undefined!");
        }
        double slope = (double) (y2 - y1) / (x2 - x1);
        double intercept = y1 - slope * x1;
        return new double[]{slope, intercept};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x1 y1: ");
        int x1 = sc.nextInt(), y1 = sc.nextInt();
        System.out.print("Enter x2 y2: ");
        int x2 = sc.nextInt(), y2 = sc.nextInt();

        double dist = euclideanDistance(x1, y1, x2, y2);
        System.out.printf("Euclidean Distance = %.2f%n", dist);

        try {
            double[] line = lineEquation(x1, y1, x2, y2);
            System.out.printf("Equation of Line: y = %.2fx + %.2f%n", line[0], line[1]);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
