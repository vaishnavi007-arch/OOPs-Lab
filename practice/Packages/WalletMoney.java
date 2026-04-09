class Wallet {
    private double balance;

    public void addMoney(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Added: " + amount);
        } else {
            System.out.println("Invalid amount");
        }
    }

    public void pay(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Payment successful: " + amount);
            } else {
                System.out.println("Insufficient balance");
            }
        } else {
            System.out.println("Invalid amount");
        }
    }

    public void checkBalance() {
        System.out.println("Balance: " + balance);
    }
}

public class WalletMoney {
    public static void main(String[] args) {
        Wallet w = new Wallet();
        w.addMoney(2000);
        w.pay(500);
        w.checkBalance();
    }
}