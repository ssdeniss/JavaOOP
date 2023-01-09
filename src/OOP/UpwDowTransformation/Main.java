package OOP.UpwDowTransformation;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog(); // Upcasting
        animal.eat();
        Dog dog = (Dog) new Animal(); // Downcasting , nu e sigur sa utilizezi
        dog.eat();
//      dog.bark(); // Error

    }
}
