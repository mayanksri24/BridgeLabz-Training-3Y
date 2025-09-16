
import java.util.Scanner;

public class UniqueCharactersDemo {

    // Method to get length without length()
    public static int getLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    // Method to find unique characters
    public static char[] findUnique(String text) {
        int n = getLength(text);
        char[] unique = new char[n];
        int index = 0;

        for (int i = 0; i < n; i++) {
            char c = text.charAt(i);
            boolean found = false;
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == c) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                unique[index++] = c;
            }
        }

        // Trim array
        char[] result = new char[index];
        for (int i = 0; i < index; i++) result[i] = unique[i];
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        char[] unique = findUnique(text);
        System.out.print("Unique characters: ");
        for (char c : unique) System.out.print(c + " ");

        sc.close();
    }
}
