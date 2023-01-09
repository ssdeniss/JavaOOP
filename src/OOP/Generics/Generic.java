package OOP.Generics;

import java.util.ArrayList;
import java.util.List;

public class Generic {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>(); // Only strings
        animals.add("cat");
        animals.add("dog");
        animals.add("frog");

        String animal = animals.get(2);
        System.out.println(animal);

    }
}
