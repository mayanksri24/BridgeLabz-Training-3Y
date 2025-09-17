import java.util.Random;

public class EmployeeBonus {

    static int[][] generateData(int n) {
        Random rand = new Random();
        int[][] data = new int[n][2]; 
        for (int i = 0; i < n; i++) {
            data[i][0] = 10000 + rand.nextInt(90000);  // salary (5 digits)
            data[i][1] = 1 + rand.nextInt(10);         // years of service (1–10)
        }
        return data;
    }

    static double[][] calculateBonus(int[][] data) {
        double[][] result = new double[data.length][3]; 
        for (int i = 0; i < data.length; i++) {
            int salary = data[i][0];
            int years = data[i][1];
            double bonusRate = years > 5 ? 0.05 : 0.02;
            double bonus = salary * bonusRate;
            double newSalary = salary + bonus;
            result[i][0] = salary;
            result[i][1] = newSalary;
            result[i][2] = bonus;
        }
        return result;
    }

    static void display(double[][] result, int[][] data) {
        double sumOld = 0, sumNew = 0, sumBonus = 0;

        System.out.printf("%-10s %-12s %-12s %-8s%n", "EmpID", "Old Salary", "New Salary", "Bonus");
        for (int i = 0; i < result.length; i++) {
            System.out.printf("%-10d %-12.2f %-12.2f %-8.2f%n", 
                (i + 1), result[i][0], result[i][1], result[i][2]);
            sumOld += result[i][0];
            sumNew += result[i][1];
            sumBonus += result[i][2];
        }

        System.out.println("\nTotal Old Salary: " + sumOld);
        System.out.println("Total New Salary: " + sumNew);
        System.out.println("Total Bonus Paid: " + sumBonus);
    }

    public static void main(String[] args) {
        int[][] data = generateData(10);
        double[][] result = calculateBonus(data);
        display(result, data);
    }
}
