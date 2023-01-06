package OOP.StringBuilder;

public class StringBuilderExample {
    public static void main(String[] args) {
        String x = "Text";
        x = x.toUpperCase();
        System.out.println(x);

        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" my").append(" friend");
        System.out.println(sb.toString());

        System.out.printf("This is a string, %s %d %f \n", "MY STRING", 22, 4.5); // %s - String, %d - Digit, %f - Float
        System.out.printf("Number %5d \n", 10);
        System.out.printf("Number %.2f \n", 45.123534);
    }
}
