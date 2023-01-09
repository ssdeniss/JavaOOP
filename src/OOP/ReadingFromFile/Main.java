package OOP.ReadingFromFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static String pathFile(String path) {
        String separator = File.separator;
        return separator + "C:" + separator + "Users" + separator + "Admin" + separator + "Documents" + separator + "projects" +
                separator + "JavaLessons" + separator + "JavaLessons" + separator + "src" + separator + "OOP" +
                separator + "ReadingFromFile" + separator + path + ".txt";
    }

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File(pathFile("test"));
        File file2 = new File(pathFile("numbers"));

        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();

        Scanner scannerNumbers = new Scanner(file2);
        String line = scannerNumbers.nextLine();
        String[] numbers = line.split(" ");
        System.out.println(Arrays.toString(numbers));

        for (String number : numbers) {
            System.out.println(Integer.parseInt(number));
        }

    }
}
