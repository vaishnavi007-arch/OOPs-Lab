abstract class Payment {
    abstract void pay(double amount);
}

// Credit Card payment
class CreditCard extends Payment {
    void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card");
    }
}

// UPI payment
class UPI extends Payment {
    void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
}


public class Payment1 {
    public static void main(String[] args) {
        Payment p1 = new CreditCard();
        p1.pay(2000);

        Payment p2 = new UPI();
        p2.pay(500);
    }
}