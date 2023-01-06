package OOP.Constructor;

public class Constructor {
    public static void main(String[] args) {
        Human Andrei = new Human(); // Empty
        Human Vlad = new Human(20); // Age
        Human Gleb = new Human("Gleb"); // Name
        Human Alex = new Human("Alex", 12); // Name & age
    }
}


class Human {
    private String name;
    private int age;

    // Crearea a mai multor constructore se numeste overload
    public Human() {
        // Daca constructorul nostru e gol ii indicam niste valori default (nu e obligatoriu)
        this.name = "Default";
        this.age = 0;
        System.out.println("Empty constructor " + name + " " + age);
    }

    public Human(String name) {
        this.name = name;
        System.out.println("Name constructor " + name);
    }

    public Human(int age) {
        this.age = age;
        System.out.println("Age constructor " + age);
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Name & age constructor " + name + " " + age);
    }

}