import java.util.Random;

public class FootballHeights {
    static int sum(int[] arr) {
        int s = 0;
        for (int n : arr) s += n;
        return s;
    }
    static double mean(int[] arr) {
        return (double) sum(arr) / arr.length;
    }
    static int shortest(int[] arr) {
        int min = arr[0];
        for (int n : arr) if (n < min) min = n;
        return min;
    }
    static int tallest(int[] arr) {
        int max = arr[0];
        for (int n : arr) if (n > max) max = n;
        return max;
    }
    public static void main(String[] args) {
        Random r = new Random();
        int[] heights = new int[11];
        for (int i = 0; i < heights.length; i++) {
            heights[i] = r.nextInt(101) + 150;
            System.out.println("Player " + (i+1) + ": " + heights[i]);
        }
        System.out.println("Shortest: " + shortest(heights));
        System.out.println("Tallest: " + tallest(heights));
        System.out.println("Mean: " + mean(heights));
    }
}

