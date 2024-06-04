
public class Animal {
    String name;
    int age;
    
public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void makeSound() {
        System.out.println("The animal makes a sound");
    }

    public void eat() {
        System.out.println("The animal is eating");
    }

  // Overloaded method makeSound(int times)
    public void makeSound(int times) {
        for (int i = 0; i < times; i++) {
            makeSound();
        }
    }

    // Overloaded method eat(String foodType)
    public void eat(String foodType) {
        System.out.println("Animal is eating " + foodType);
    }

    void displayInfo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
