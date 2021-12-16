import java.util.Random;

/**
 * Testing out JDK17 features.
 * Makes use of sealed classes and pattern matching.
 */
public class App {
    public static void displayObjectType(Object object) {
        switch(object) {
            case Integer i -> System.out.println("It's an integer.");
            case String s -> System.out.println("It's a string.");
            case null -> System.out.println("The object is null.");
            default -> System.out.println("It's none of these types.");
        }
    }

    public static void displayObjectInformation(Object object) {
        switch(object) {
            case Integer i -> System.out.println("It's an integer.");
            case String s && s.contains("l") -> System.out.println("It's a string containing l.");
            case null -> System.out.println("The object is null.");
            default -> System.out.println("It's none of these types.");
        }
    }

    public static void enjoyConsumable(Consumable consumable) {
        switch(consumable) {
            case Coffee c -> c.addCream();
            case Tea t -> t.stir();
            default -> System.out.println("Do nothing.");
        }

        consumable.consume();
    }

    public static void main(String[] args) {
        System.out.println("Hello world");
        Random random = new Random();
        displayObjectType("Sally");
        displayObjectType(3);
        displayObjectType(null);
        displayObjectType(random);
        displayObjectInformation("Sally");
        displayObjectInformation("Sam");

        Coffee coffee = new Coffee();
        Tea tea = new Tea();
        Beverage beverage = new Beverage();

        enjoyConsumable(coffee);
        enjoyConsumable(tea);
        enjoyConsumable(beverage);
    }
}
