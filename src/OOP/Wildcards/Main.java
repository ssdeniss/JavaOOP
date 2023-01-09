package OOP.Wildcards;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> listOfAnimal = new ArrayList<>();
        listOfAnimal.add(new Animal(1));
        listOfAnimal.add(new Animal(2));

        List<Dog> listOfDogs = new ArrayList<>();
        listOfDogs.add(new Dog());
        listOfDogs.add(new Dog());

        test(listOfAnimal);
        test(listOfDogs);

    }

    // extends - show only Animal and Dog
    // super - show only higher Animal (Object)
    private static void test(List<? extends Animal> list) {
        for (Animal animal : list) {
            System.out.println(animal);
        }
    }
}
