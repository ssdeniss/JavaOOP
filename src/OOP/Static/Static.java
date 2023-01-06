package OOP.Static;

public class Static {
    public static void main(String[] args) {
        Human.description = "Description about humans";
        Human.getDescription();
        Human Alexei = new Human("Alexei", 30);
        Alexei.setName("Alexei");
    }
}

class Human {
    private String name;
    private int age;
    public static String description;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println(name + " " + age);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void getDescription() {
        // Metodele statice vor lucra doar cu variabilele statice
        System.out.println(description);
    }

}