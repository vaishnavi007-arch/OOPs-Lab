//Define an interface Vehicle with methods:
//- start()
//- stop()
//Implement two classes:
//- Car → prints "Car started" and "Car stopped".
//- Bike → prints "Bike started" and "Bike stopped".
//Write a program that:
//- Demonstrates polymorphism by storing both Car and Bike objects in a //Vehicle reference.
//- Calls their respective methods.

// Interface
interface Vehicle {
    void start();
    void stop();
}

// Car class
class Car implements Vehicle {
    public void start() {
        System.out.println("Car started");
    }
    public void stop() {
        System.out.println("Car stopped");
    }
}

// Bike class
class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike started");
    }
    public void stop() {
        System.out.println("Bike stopped");
    }
}

// Main class
public class InterfaceDemo {
    public static void main(String[] args) {
        Vehicle v1 = new Car();  // Polymorphism
        Vehicle v2 = new Bike();

        v1.start();
        v1.stop();

        v2.start();
        v2.stop();
    }
}