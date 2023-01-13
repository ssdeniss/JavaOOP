package OOP.Enum;

public class Enumeration {
    public static void main(String[] args) {
        AnimalEnum animal = AnimalEnum.CAT;

        switch (animal) {
            case DOG:
                System.out.println("It's a dog");
                break;
            case CAT:
                System.out.println("It's a cat");
                break;
            case FROG:
                System.out.println("It's a frog");
                break;
            default:
                System.out.println("It's another animal");
        }
        Season season = Season.SUMMER;

        switch (season) {
            case SUMMER:
                System.out.println("It's SUMMER");
                break;
            case WINTER:
                System.out.println("It's WINTER");
                break;
            case SPRING:
                System.out.println("It's SPRING");
                break;
            case AUTUMN:
                System.out.println("It's AUTUMN");
                break;
        }

    }
}
