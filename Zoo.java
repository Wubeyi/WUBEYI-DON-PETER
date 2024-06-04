
public class Zoo {
    public static void main(String[] args) {
        Animal lion = new Lion("Ubey", 5);
        Animal elephant = new Elephant("Don", 10);
        Animal monkey = new Monkey("Peter", 3);

        System.out.println("Lion Info:");
        lion.displayInfo();
        System.out.println("Lion roars:");
        lion.makeSound();
        System.out.println("Lion eats:");
        lion.eat();
        System.out.println("Lion makes roars alot:");
        lion.makeSound(3);
        System.out.println("Lion eats meat:");
        lion.eat("meat");
        System.out.println();

        System.out.println("Elephant Info:");
        elephant.displayInfo();
        System.out.println("Elephant rumbles alot:");
        elephant.makeSound();
        System.out.println("Elephant eats:");
        elephant.eat();
        System.out.println("Elephant rumbles:");
        elephant.makeSound(2);
        System.out.println("Elephant eats grass:");
        elephant.eat("grass");
        System.out.println();

        System.out.println("Monkey Info:");
        monkey.displayInfo();
        System.out.println("Monkey makes sounds:");
        monkey.makeSound();
        System.out.println("Monkey eats:");
        monkey.eat();
        System.out.println("Monkey makes chants alot:");
        monkey.makeSound(4);
        System.out.println("Monkey eats bananas:");
        monkey.eat("bananas");
    }
}