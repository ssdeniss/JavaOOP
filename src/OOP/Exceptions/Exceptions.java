package OOP.Exceptions;

import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) throws ScannerExceptions {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int x = Integer.parseInt(scanner.nextLine());

            if (x != 0) throw new ScannerExceptions("User enter something other than 0");
        }
    }
}
