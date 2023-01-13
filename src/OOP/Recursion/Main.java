package OOP.Recursion;

public class Main {
    public static void main(String[] args) {
        counter(3);
    }

    public static void counter(int n) {
        System.out.println(n);
        if (n == 0) {
            return;
        }
        counter(n - 1); // Recursion
    }
}
