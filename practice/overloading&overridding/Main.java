class Calculator {
    // PUBLIC: Works everywhere
    public int add(int a, int b) {
        return a + b;
    }

    // PROTECTED: Works in the same package or subclasses
    protected int add(int a, int b, int c) {
        return a + b + c;
    }

    // PRIVATE: Can ONLY be called inside this class
    private double add(double a, double b) {
        return a + b;
    }

    // PUBLIC WRAPPER: This is how we access the private method safely
    public void displayDecimalAddition(double a, double b) {
        System.out.println("Result: " + add(a, b)); 
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // VALID CALLS:
        System.out.println(calc.add(10, 20));       // Calls public (2 ints)
        System.out.println(calc.add(10, 20, 30));   // Calls protected (3 ints)
        calc.displayDecimalAddition(10.5, 20.5);    // Calls public wrapper

        // INVALID CALL (Will cause error):
        // calc.add(10.5, 20.5); // ERROR: add(double, double) is private!
    }
}