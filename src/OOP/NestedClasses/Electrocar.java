package OOP.NestedClasses;

public class Electrocar {
    private int id = 0;

    public Electrocar(int id) {
        this.id = id;
    }

    public void start() {
        System.out.println("Electrocar " + id + " is starting...");
        final int x = 1;
        //? Class inside a method
        //? Can receive only constants
        class SomeClass {
            public void SomeMethod() {
                System.out.println(x);
                System.out.println(id);
            }
        }
    }

    //? No static nested class, can receive all values
    private class Motor {
        public void startMotor() {
            System.out.println("Motor" + id + " is starting...");
        }
    }

    //? Static nested class , can receive only static value
    //? Can create an object
    public static class Battery {
        public void charge() {
            System.out.println("Battery is charging...");
        }
    }
}
