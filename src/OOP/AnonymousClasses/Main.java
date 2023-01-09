package OOP.AnonymousClasses;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();
        OtherAnimal other = new OtherAnimal();
        other.eat();
        AbleToEat ableToEat = new AbleToEat() {
            @Override
            public void eat() {
                System.out.println("Someone is eating...");
            }
        };
        ableToEat.eat();

// Anonymous class
        Animal AnonymousAnimal = new Animal() {
            public void eat() {
                System.out.println("Anonymous animal is eating...");
            }
        };
        AnonymousAnimal.eat();
    }
}
