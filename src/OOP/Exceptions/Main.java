package OOP.Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            readFile();
        } catch (FileNotFoundException e) {
            System.out.println("File not founded");
        }
    }

    public static void readFile() throws FileNotFoundException {
        File file = new File("qwer");
        Scanner scanner = new Scanner(file);
    }
}
