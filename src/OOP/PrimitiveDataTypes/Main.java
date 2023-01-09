package OOP.PrimitiveDataTypes;

public class Main {
    public static void main(String[] args) {
        int a = 123;
        long l = 12324L;
        float f = 123.2F;
        double d = 13212.2324;

        long u = a; // Ne explicit
        int x = (int) l; // Explicit
        float s = (float) d; // Explicit
        int t = (int) d; // Explicit
        byte b = (byte) 128; // -128
        System.out.println(Math.round(d));

    }
}
