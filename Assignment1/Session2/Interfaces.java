
// Step 1: Create the interface
interface Drivable {
    void startEngine();  // abstract method
    void stopEngine();   // abstract method
}

// Step 2: Implement interface in Car class
class Car implements Drivable {

    String brand;
    
    public Car(String brand) {
        this.brand = brand;
    }

    // Implement startEngine method
    @Override
    public void startEngine() {
        System.out.println(brand + " engine started.");
    }

    // Implement stopEngine method
    @Override
    public void stopEngine() {
        System.out.println(brand + " engine stopped.");
    }
}

// Step 3:  main
public class Interfaces {
    public static void main(String[] args) {

        Car myCar = new Car("Toyota");

        // Using the implemented methods
        myCar.startEngine();
        myCar.stopEngine();
    }
}
