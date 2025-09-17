
import java.util.Scanner;

public class TriangularParkRun {
    public static double calculateRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        double distance = 5000.0; // 5km = 5000 meters
        return distance / perimeter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side 1: ");
        double s1 = sc.nextDouble();
        System.out.print("Enter side 2: ");
        double s2 = sc.nextDouble();
        System.out.print("Enter side 3: ");
        double s3 = sc.nextDouble();

        System.out.println("Rounds required: " + calculateRounds(s1, s2, s3));
        sc.close();
    }
}
