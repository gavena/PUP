public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog barks");
    }

    public void makeSound(int count) {
        for (int i = 0; i < count; i++) {
            System.out.println("Bark!");
        }
    }
}