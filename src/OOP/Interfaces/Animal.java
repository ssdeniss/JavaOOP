package OOP.Interfaces;

public class Animal implements Information {
    public int id;

    public void sleep() {
        System.out.println("I'm sleeping");
    }

    public Animal(int id) {
        this.id = id;
    }

    @Override
    public void showInfo() {
        System.out.println("Id is " + this.id);
    }
}
