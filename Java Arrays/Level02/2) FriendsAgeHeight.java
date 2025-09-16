import java.util.Scanner;

public class FriendsAgeHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        int[] heights = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter age of " + names[i] + ": ");
            ages[i] = sc.nextInt();
            System.out.println("Enter height of " + names[i] + ": ");
            heights[i] = sc.nextInt();
        }

        int minAge = ages[0], youngest = 0;
        int maxHeight = heights[0], tallest = 0;

        for (int i = 1; i < 3; i++) {
            if (ages[i] < minAge) {
                minAge = ages[i];
                youngest = i;
            }
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                tallest = i;
            }
        }

        System.out.println("Youngest friend is " + names[youngest]);
        System.out.println("Tallest friend is " + names[tallest]);
        sc.close();
    }
}
