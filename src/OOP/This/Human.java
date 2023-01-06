package OOP.This;

public class Human {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name; // Cu ajutorul keiei this, noi indicam ca variabilei name a clasei Human
    }                     // i se atribuie valoarea variabilei name din metoda set

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void getInfo() {
        if (!name.isEmpty()) {
            System.out.println("My name is " + name);
        }
        if (age > 0) {
            System.out.println("I am " + age + " old");
        }
    }
}
