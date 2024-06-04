
public class Lion extends Animal {

    public Lion(String name, int age) {
        super(name, age);
    }
    @Override
    public void makeSound() {
        System.out.println("Roars");
    }

    @Override
    public void eat() {
        System.out.println("Hunts for meat");
    }
}
    