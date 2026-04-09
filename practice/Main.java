abstract class Vehicle {
    // Abstract methods
    abstract void start();
    abstract void stop();
}

// Car class
class Car extends Vehicle {
    void start() {
        System.out.println("Car starts with key");
    }

    void stop() {
        System.out.println("Car stops with brake");
    }
}

// Bike class
class Bike extends Vehicle {
    void start() {
        System.out.println("Bike starts with kick");
    }

    void stop() {
        System.out.println("Bike stops with hand brake");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        v1.start();
        v1.stop();

        Vehicle v2 = new Bike();
        v2.start();
        v2.stop();
    }
}