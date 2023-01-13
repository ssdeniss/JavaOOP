package OOP.Serialization;

import java.io.File;
import java.io.Serializable;

public class Person implements Serializable {
    public static String pathFile(String path) {
        String separator = File.separator;
        return separator + "C:" + separator + "Users" + separator + "Admin" + separator + "Documents" + separator + "projects" +
                separator + "JavaLessons" + separator + "JavaLessons" + separator + "src" + separator + "OOP" +
                separator + "Serialization" + separator + path + ".bin";
    }

    private transient int id; // use transient to avoid serialization
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return id + " : " + name;
    }
}
