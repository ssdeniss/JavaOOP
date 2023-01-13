package OOP.Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadObject {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream(Person.pathFile("people"));
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(Person.pathFile("people")))) {
                Person person1 = (Person) ois.readObject();
                Person person2 = (Person) ois.readObject();
                int personCount = ois.readInt();
                Person[] people = new Person[personCount];
                System.out.println(person1);
                System.out.println(person2);

                for (int i = 0; i < personCount; i++) {
                    people[i] = (Person) ois.readObject();
                }
                System.out.println(Arrays.toString(people));

                Person[] people1 = (Person[]) ois.readObject();
                System.out.println(Arrays.toString(people1));
            } catch (IOException | ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
