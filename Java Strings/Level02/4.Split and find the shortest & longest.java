
import java.util.Scanner;

public class ShortestLongestWord {

    // Method to find length without length()
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    // Split words manually
    public static String[] splitWords(String text) {
        int n = findLength(text);
        int spaceCount = 0;
        for (int i = 0; i < n; i++) {
            if (text.charAt(i) == ' ') spaceCount++;
        }
        String[] words = new String[spaceCount + 1];
        int index = 0, start = 0;
        for (int i = 0; i < n; i++) {
            if (text.charAt(i) == ' ') {
                words[index++] = text.substring(start, i);
                start = i + 1;
            }
        }
        words[index] = text.substring(start, n);
        return words;
    }

    // Method to find shortest & longest
    public static String[] findShortestLongest(String[] words) {
        String shortest = words[0], longest = words[0];

        for (String w : words) {
            if (findLength(w) < findLength(shortest)) shortest = w;
            if (findLength(w) > findLength(longest)) longest = w;
        }

        return new String[]{shortest, longest};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        String[] words = splitWords(text);
        String[] result = findShortestLongest(words);

        System.out.println("\nShortest Word: " + result[0] + " (Length: " + findLength(result[0]) + ")");
        System.out.println("Longest Word: " + result[1] + " (Length: " + findLength(result[1]) + ")");
        sc.close();
    }
}
