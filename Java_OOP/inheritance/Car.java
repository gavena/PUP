// Car.java
public class Car extends Vehicle {
    private int numDoors;

    public Car(String name, int year, String color, int numDoors) {
        super(name, year, color);
        this.numDoors = numDoors;
    }

    public void honk() {
        System.out.println("Honking the horn...");
    }

    public void drift() {
        System.out.println("Drifting the car...");
    }

/*
    //Polymorphism //overriding
    public void start() {
        System.out.println("Starting the vehicle beeeee...");
    }

    //Polymorphism //overloading
    public void drift(int i) {
        System.out.println("Drifting the car to curve..." +i);
    }
*/

}