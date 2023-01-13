package OOP.WriteToFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main {
    public static String pathFile(String path) {
        String separator = File.separator;
        return separator + "C:" + separator + "Users" + separator + "Admin" + separator + "Documents" + separator + "projects" +
                separator + "JavaLessons" + separator + "JavaLessons" + separator + "src" + separator + "OOP" +
                separator + "WriteToFile" + separator + path + ".txt";
    }

    public static void main(String[] args) throws FileNotFoundException {

        PrintWriter writer = new PrintWriter(pathFile("NewFileCreated"));

        writer.println("Write text 1 to file");
        writer.println("Write text 2 to file");
        writer.println("Write text 3 to file");
        writer.close();
    }
}
