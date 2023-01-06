package OOP.StringBuilder;

public class StringBuilderExample {
    public static void main(String[] args) {
        String x = "Text";
        x = x.toUpperCase();
        System.out.println(x);

        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" my").append(" friend");
        System.out.println(sb.toString());
    }
}
