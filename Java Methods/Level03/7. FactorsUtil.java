import java.util.*;

public class FactorsUtil {
    static int[] factors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) count++;
        int[] f = new int[count]; int idx = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) f[idx++] = i;
        return f;
    }
    static int greatest(int[] f) {
        int max = f[0]; for (int x : f) if (x > max) max = x; return max;
    }
    static int sum(int[] f) {
        int s = 0; for (int x : f) s += x; return s;
    }
    static int product(int[] f) {
        int p = 1; for (int x : f) p *= x; return p;
    }
    static double productCube(int[] f) {
        double p = 1; for (int x : f) p *= Math.pow(x, 3); return p;
    }
    public static void main(String[] args) {
        int n = 12;
        int[] f = factors(n);
        System.out.println("Factors: " + Arrays.toString(f));
        System.out.println("Greatest: " + greatest(f));
        System.out.println("Sum: " + sum(f));
        System.out.println("Product: " + product(f));
        System.out.println("Cube Product: " + productCube(f));
    }
}
