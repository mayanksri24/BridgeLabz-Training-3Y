public class NumberChecker2 {
    static int[] digits(int n) {
        String s = String.valueOf(n);
        int[] d = new int[s.length()];
        for (int i = 0; i < s.length(); i++) d[i] = s.charAt(i) - '0';
        return d;
    }
    static int sumDigits(int n) {
        int sum = 0; for (int d : digits(n)) sum += d; return sum;
    }
    static int sumSquares(int n) {
        int sum = 0; for (int d : digits(n)) sum += Math.pow(d, 2); return sum;
    }
    static boolean isHarshad(int n) {
        return n % sumDigits(n) == 0;
    }
    static void freqDigits(int n) {
        int[] f = new int[10];
        for (int d : digits(n)) f[d]++;
        for (int i = 0; i < 10; i++) if (f[i] > 0)
            System.out.println(i + " -> " + f[i]);
    }
    public static void main(String[] args) {
        int n = 21;
        System.out.println("Sum: " + sumDigits(n));
        System.out.println("Squares Sum: " + sumSquares(n));
        System.out.println("Harshad: " + isHarshad(n));
        freqDigits(n);
    }
}
