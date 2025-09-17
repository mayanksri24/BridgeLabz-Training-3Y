
import java.util.Scanner;

public class ChocolateDistribution {
    public static int[] distribute(int chocolates, int children) {
        return new int[]{chocolates / children, chocolates % children};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of chocolates: ");
        int chocolates = sc.nextInt();
        System.out.print("Enter number of children: ");
        int children = sc.nextInt();

        int[] result = distribute(chocolates, children);
        System.out.println("Each child gets: " + result[0] + " chocolates, Remaining: " + result[1]);
        sc.close();
    }
}
