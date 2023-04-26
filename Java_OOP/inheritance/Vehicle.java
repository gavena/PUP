// Vehicle.java
public class Vehicle {
    private String name;
    private int year;
    private String color;

    public Vehicle(String name, int year, String color) {
        this.name = name;
        this.year = year;
        this.color = color;
    }

    public void start() {
        System.out.println("Starting the vehicle...");
    }

    public void stop() {
        System.out.println("Stopping the vehicle...");
    }

    public void accelerate() {
        System.out.println("Accelerating the vehicle...");
    }

    public void brake() {
        System.out.println("Applying the brake...");
    }
}
