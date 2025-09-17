public class NumberChecker1 {
    static int countDigits(int n) {
        return String.valueOf(n).length();
    }
    static int[] digits(int n) {
        String s = String.valueOf(n);
        int[] d = new int[s.length()];
        for (int i = 0; i < s.length(); i++) d[i] = s.charAt(i) - '0';
        return d;
    }
    static boolean isDuck(int n) {
        for (int d : digits(n)) if (d == 0) return true;
        return false;
    }
    static boolean isArmstrong(int n) {
        int[] d = digits(n);
        int p = d.length, sum = 0;
        for (int x : d) sum += Math.pow(x, p);
        return sum == n;
    }
    static void largestSmallest(int n) {
        int[] d = digits(n);
        int l1 = Integer.MIN_VALUE, l2 = Integer.MIN_VALUE;
        int s1 = Integer.MAX_VALUE, s2 = Integer.MAX_VALUE;
        for (int x : d) {
            if (x > l1) { l2 = l1; l1 = x; }
            else if (x > l2 && x != l1) l2 = x;
            if (x < s1) { s2 = s1; s1 = x; }
            else if (x < s2 && x != s1) s2 = x;
        }
        System.out.println("Largest: " + l1 + ", Second Largest: " + l2);
        System.out.println("Smallest: " + s1 + ", Second Smallest: " + s2);
    }
    public static void main(String[] args) {
        int n = 153;
        System.out.println("Duck: " + isDuck(n));
        System.out.println("Armstrong: " + isArmstrong(n));
        largestSmallest(n);
    }
}
