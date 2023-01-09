package OOP.Generics;

import java.util.ArrayList;
import java.util.List;

public class OldGeneric {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("cat");
        list.add("dog");
        list.add("frog");

        String animal = (String) list.get(1);
        System.out.println(animal);
    }
}
