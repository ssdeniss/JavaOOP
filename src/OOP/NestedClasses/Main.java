package OOP.NestedClasses;

public class Main {
    public static void main(String[] args) {
        Electrocar car = new Electrocar(1);
        car.start();
        Electrocar.Battery battery = new Electrocar.Battery();
    }
}
