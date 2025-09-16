
import java.util.Scanner;

public class FriendsComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Ram's age and height: ");
        int age1 = sc.nextInt(); 
        int height1 = sc.nextInt();

        System.out.print("Enter Rahman's age and height: ");
        int age2 = sc.nextInt(); 
        int height2 = sc.nextInt();

        System.out.print("Enter Rishika's age and height: ");
        int age3 = sc.nextInt(); 
        int height3 = sc.nextInt();

        
        if (age1 < age2 && age1 < age3) {
            System.out.println("Ram is the youngest.");
        } else if (age2 < age1 && age2 < age3) {
            System.out.println("Rahman is the youngest.");
        } else {
            System.out.println("Rishika is the youngest.");
        }

        
        if (height1 > height2 && height1 > height3) {
            System.out.println("Ram is the tallest.");
        } else if (height2 > height1 && height2 > height3) {
            System.out.println("Rahman is the tallest.");
        } else {
            System.out.println("Rishika is the tallest.");
        }

        sc.close();
    }
}
