package OOP.Serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        Person person1 = new Person(1, "John");
        Person person2 = new Person(2, "Bob");
        Person[] people = {new Person(1, "Alex"), new Person(2, "Mike"), new Person(3, "Tomy")};
        Person[] people1 = {new Person(1, "Den"), new Person(2, "Riky"), new Person(3, "Josch")};

        try (FileOutputStream fos = new FileOutputStream(Person.pathFile("People"))) {
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(person1);
            oos.writeObject(person2);
            oos.writeInt(people.length);
            for (Person person : people) {
                oos.writeObject(person);
            }
            oos.writeObject(people1);
            oos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
