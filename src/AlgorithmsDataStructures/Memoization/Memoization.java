package AlgorithmsDataStructures.Memoization;


import java.util.Arrays;

public class Memoization {
    public static void main(String[] args) {
        // Scaparea de calculele repetate
        int n = 100;
        long[] memo = new long[n + 1];
        Arrays.fill(memo, -1);
        System.out.println(fibNaive(n, memo));
    }

    private static long fibNaive(int n, long[] memo) {
        if (memo[n] != -1) return memo[n];
        if (n <= 1) return n;

        long result = fibNaive(n - 1, memo) + fibNaive(n - 2, memo);
        memo[n] = result;
        return result;
    }
}
