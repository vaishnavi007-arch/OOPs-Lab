// Save this file as AdvancedCalculator.java
class Calculator {
    // 1. Public method for addition
    public int add(int a, int b) {
        System.out.print("Base Addition: ");
        return a + b;
    }

    // 2. Protected method to show a message
    protected void display() {
        System.out.println("Message from Base Calculator.");
    }

    // 3. Private method accessed via a public wrapper
    private void show() {
        System.out.println("This is a Private method in Base.");
    }

    public void accessPrivate() {
        show(); // Internal call to the private method
    }
}

class AdvancedCalculator extends Calculator {
    // 4. Overriding the add method
    @Override
    public int add(int a, int b) {
        System.out.print("Advanced Addition (with a bonus 10): ");
        return a + b + 10;
    }

    // 5. Overriding the display method
    @Override
    protected void display() {
        System.out.println("Message from Advanced Calculator.");
    }

    // 6. This is NOT an override. It's a new method because the 
    // parent's 'show' was private and invisible to this class.
    public void show() {
        System.out.println("This is a NEW show method in Advanced.");
    }
}

public class Calc {
    public static void main(String[] args) {
        // A. Base class reference to Base object
        Calculator base = new Calculator();
        
        // B. Child class reference to Child object
        AdvancedCalculator adv = new AdvancedCalculator();

        // C. Runtime Polymorphism: Parent reference to Child object
        Calculator poly = new AdvancedCalculator();

        System.out.println("--- Testing Polymorphism ---");
        // This will call the ADVANCED version of add, even though the reference is 'Calculator'
        System.out.println(poly.add(10, 20)); 
        
        poly.display(); // Calls Advanced version
        poly.accessPrivate(); // Calls the PRIVATE method defined in the BASE class
    }
}