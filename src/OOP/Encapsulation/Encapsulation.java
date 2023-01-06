package OOP.Encapsulation;

public class Encapsulation {
    public static void main(String[] args) {
        Person human = new Person();
        human.setName("Andrei");
        human.setAge(20);
        if (!human.getName().isEmpty() && human.getAge() > 0) {
            System.out.println("My name is " + human.getName() + " and i am " + human.getAge() + " years old");
        } else {
            System.out.println("Error");
        }
    }
}

class Person {
    private String name;
    private int age;

    public void setName(String name) {
        if (name.isEmpty()) {
            System.out.println("Empty name");
        } else {
            this.name = name;
        }

    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Age is less than 0");
        } else {
            this.age = age;
        }

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
