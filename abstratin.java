 // Abstract class
abstract class Vehicle {
    // Abstract method (no body)
    abstract void start();

    // Normal method
    void fuel() {
        System.out.println("Every vehicle needs fuel.");
    }
}

// Concrete class (Child class)
class Car extends Vehicle {
    // Providing implementation of abstract method
    void start() {
        System.out.println("Car starts with a key.");
    }
}

// Another concrete class
class Bike extends Vehicle {
    void start() {
        System.out.println("Bike starts with a self-start button.");
    }
}

// Main class
public class AbstractionExample {
    public static void main(String[] args) {
        Vehicle v1 = new Car();   // Upcasting
        v1.start();               // Calls Car's start method
        v1.fuel();

        Vehicle v2 = new Bike();  // Upcasting
        v2.start();               // Calls Bike's start method
        v2.fuel();
    }
}

