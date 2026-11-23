// Interface
interface Vehicle {
    void start();   // abstract method (by default in interface)
    void stop();
}
// Abstract class
abstract class FourWheeler {
    abstract void fuelType();   // abstract method
    void wheels() {             // concrete method
        System.out.println("This vehicle has 4 wheels.");
    }
}
// Concrete class implementing interface & extending abstract class
class Car extends FourWheeler implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car is starting...");
    }
    @Override 
    public void stop() {
        System.out.println("Car has stopped.");
    }
    @Override
    void fuelType() {
        System.out.println("Car runs on petrol.");
    }
}
// Main class
public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start();
        myCar.fuelType();
        myCar.wheels();
        myCar.stop();
    }
}