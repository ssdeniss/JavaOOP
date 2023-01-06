import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        switch (age) {
            case 10:
                System.out.println("You are a schoolboy");
                break;
            case 20:
                System.out.println("You are a student schoolboy");
                break;
            default:
                System.out.println("Your age:  " + age);
        }
    }
}
