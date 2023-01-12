package OOP.Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckedUnchecked {
    public static void main(String[] args) {
        // Checked Exception  - compile time exception
        File file = new File("tet");
        try {
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Error");
        }

        // Unchecked Exception - runtime exception
//        int a = 1 / 0; ------- exception devide by 0
//        String name = null;
//        name.length(); ------- exception null pointer
//        int[] arr = new int[2];
//        System.out.println(arr[2]); ------- exception index out
    }
}
