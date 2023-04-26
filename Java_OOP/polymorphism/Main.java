



public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound(); // Output: The animal makes a sound

        Dog dog = new Dog();
        dog.makeSound(); // Output: The dog barks

        dog.makeSound(3); // Output: Bark! Bark! Bark!
    }
}
