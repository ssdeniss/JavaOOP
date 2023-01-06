package OOP.Interfaces;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal(5);
        Person person = new Person("Alex");
        animal.sleep();
        person.sayHello();
        person.showInfo();
        animal.showInfo();
        Information infoAnimal = new Animal(1);
        Information infoPerson = new Person("George");
        infoAnimal.showInfo();
        infoPerson.showInfo();
        outputInfo(infoAnimal);
        outputInfo(infoPerson);
    }
    public static void outputInfo(Information info){
        info.showInfo();
    }
}
