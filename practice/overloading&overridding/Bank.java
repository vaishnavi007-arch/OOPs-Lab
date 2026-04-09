class BankAccount {
    private String accountHolder;
    private double balance;

    public BankAccount(String name, double balance) {
        this.accountHolder = name;
        this.balance = balance;
    }

    
    public double getBalance() {
        return balance;
    }

   
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }
}


public class Bank {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("John", 1000);

        acc.deposit(500);
        acc.withdraw(300);

        System.out.println("Final Balance: " + acc.getBalance());
    }
}