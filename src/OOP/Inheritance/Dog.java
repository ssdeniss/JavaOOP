package OOP.Inheritance;

public class Dog extends Animal {
    @Override
    public void eat() { // Redefinim metoda eat pentru caine
        super.eat();
        System.out.println("Dog is eating");
    }

    public void bark() {
        System.out.println("I am barking");
    }
    public void showName(){
        System.out.println(name);
    }
}
