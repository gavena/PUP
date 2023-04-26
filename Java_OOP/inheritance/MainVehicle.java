


// MainVehicle.java
public class MainVehicle {
    public static void main(String[] args) {
        Car myCar = new Car("BMW", 2021, "Black", 4);
        myCar.start();
        myCar.accelerate();
        myCar.brake();
        myCar.drift();
        myCar.drift(1);
        myCar.honk();
        myCar.stop();
    }
}
