package OOP.Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream(Person.pathFile("people"));
            try {
                ObjectInputStream ois = new ObjectInputStream(fis);
                Person person1 = (Person) ois.readObject();
                Person person2 = (Person) ois.readObject();

                System.out.println(person1);
                System.out.println(person2);
                ois.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
