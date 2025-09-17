import java.util.Scanner;

public class NumberCheck {
    public static boolean isPositive(int n) {
        return n >= 0;
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static int compare(int a, int b) {
        if (a > b) return 1;
        if (a == b) return 0;
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            nums[i] = sc.nextInt();

            if (isPositive(nums[i])) {
                System.out.println("Positive");
                if (isEven(nums[i])) System.out.println("Even");
                else System.out.println("Odd");
            } else {
                System.out.println("Negative");
            }
        }

        int result = compare(nums[0], nums[4]);
        if (result == 0) System.out.println("First and last are equal.");
        else if (result == 1) System.out.println("First is greater than last.");
        else System.out.println("First is less than last.");

        sc.close();
    }
}
