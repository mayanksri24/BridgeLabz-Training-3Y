
import java.util.Scanner;

public class StringLength {
   
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count); // will throw exception when count exceeds
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count; // return length once exception occurs
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        System.out.print("Enter a string: ");
        String input = sc.next();

        
        int myLength = findLength(input);

        
        int builtInLength = input.length();

        System.out.println("Length (User-defined): " + myLength);
        System.out.println("Length (Built-in): " + builtInLength);

        sc.close();
    }
}

