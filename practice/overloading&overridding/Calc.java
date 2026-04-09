class Calculator {
    
    public int add(int a, int b) {
        return a + b;
    }

    protected int add(int a, int b, int c) {
        return a + b + c;
    }

  
    private double add(double a, double b) {
        return a + b;
    }

    public void displayDecimalSum(double a, double b) {
        double result = add(a, b);
        System.out.println("The decimal sum is: " + result);
    }
}

public class Calc {
    public static void main(String[] args) {
        Calculator myCalc = new Calculator();

        int sum2 = myCalc.add(10, 20);
        System.out.println("Sum of two integers: " + sum2);

        int sum3 = myCalc.add(10, 20, 30);
        System.out.println("Sum of three integers: " + sum3);
        myCalc.displayDecimalSum(5.5, 4.5);
    }
}