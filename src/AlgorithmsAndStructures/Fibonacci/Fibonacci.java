package AlgorithmsAndStructures.Fibonacci;

public class Fibonacci {
    public static void main(String[] args) {
//        System.out.println(fibNaive(5));
//        System.out.println(fibNaive(10));
//        System.out.println(fibNaive(20));
//        System.out.println(fibNaive(30));
        System.out.println(fibEffective(100));
    }

    //! Cel mai incet algoritmu, prin recursie
    //? Pentru determinarea numarului 100 prin recursie va ocupa in jur la 50.000 de ani
    private static long fibNaive(int n) {
        if (n <= 1) return n;

        return fibNaive(n - 1) + fibNaive(n - 2);
    }

    //! Algoritm rapid
    private static long fibEffective(int n) {
        long[] arr = new long[n + 1];
        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i <= n; i++) arr[i] = arr[i - 1] + arr[i - 2];
        return arr[n];
    }
}
