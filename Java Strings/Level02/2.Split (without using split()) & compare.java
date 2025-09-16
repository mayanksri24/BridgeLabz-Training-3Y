
import java.util.Scanner;

public class SplitWordsDemo {

    
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

    
    public static String[] splitWords(String text) {
        int n = findLength(text);
        int spaceCount = 0;

       
        for (int i = 0; i < n; i++) {
            if (text.charAt(i) == ' ') {
                spaceCount++;
            }
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

        return words;
    }

    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        String[] userWords = splitWords(text);
        String[] builtInWords = text.split(" ");

        System.out.println("\nWords (User-defined): ");
        for (String w : userWords) System.out.println(w);

        System.out.println("\nWords (Built-in split()): ");
        for (String w : builtInWords) System.out.println(w);

        boolean isSame = compareArrays(userWords, builtInWords);
        System.out.println("\nComparison result: " + (isSame ? "MATCH" : "DO NOT MATCH"));

        sc.close();
    }
}
