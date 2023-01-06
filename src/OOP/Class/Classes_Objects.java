package OOP.Class;

public class Classes_Objects {
    public static void main(String[] args) {
        Person human = new Person();
        human.name = "Andrei";
        human.age = 20;
        Person human2 = new Person();
        human2.name = "Roma";
        human2.age = 14;
        human.speak();
        int yearToRetirement = human.calculateYearsToRetirement();
        System.out.println(human.name + " have " + yearToRetirement + " years before retirement");
        human.setName("Vladimir");
    }
}

class Person {
    String name;
    int age;

    void setName(String userName) {
        name = userName;
        System.out.println(userName);
    }

    void speak() {
        System.out.println("My name is " + name + " and i am " + age + " years old");
    }

    int calculateYearsToRetirement() {
        int years = 65 - age;
        return years;
    }
}
