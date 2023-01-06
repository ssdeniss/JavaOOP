package OOP.Interfaces;

public class Person implements Information {
    public String name;

    public void sayHello() {
        System.out.println("Hello");
    }

    public Person(String name) {
        this.name = name;
    }

    @Override
    public void showInfo() {
        System.out.println("Name is " + this.name);
    }
}
