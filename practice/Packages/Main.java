public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Sum = " + calc.add(5, 3));
    }
}

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
}