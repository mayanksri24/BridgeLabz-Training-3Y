
import java.util.Scanner;

public class WordsWithLengthDemo {

    // Method to find string length without using length()
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

    // Method to split words manually
    public static String[] splitWords(String text) {
        int n = findLength(text);
        int spaceCount = 0;

        // Count spaces
        for (int i = 0; i < n; i++) {
            if (text.charAt(i) == ' ') spaceCount++;
        }

        String[] words = new String[spaceCount + 1];
        int wordIndex = 0, start = 0;

        for (int i = 0; i < n; i++) {
            if (text.charAt(i) == ' ') {
                words[wordIndex++] = text.substring(start, i);
                start = i + 1;
            }
        }
        words[wordIndex] = text.substring(start, n);
