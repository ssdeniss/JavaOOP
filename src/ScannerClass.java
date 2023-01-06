import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Print something: ");
        String string = s.nextLine();
        System.out.println("You printed: " + string);
    }
}
