package OOP.AbstractClasses;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        cat.makeSound();
        dog.makeSound();
        cat.eat();
        dog.eat();
    }
}
