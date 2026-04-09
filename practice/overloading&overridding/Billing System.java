// Superclass: InvoiceProcessor
class InvoiceProcessor {
    
  
    private double calculateHandlingFee(double amount) {
        return amount * 0.02; // Fixed 2% handling fee
    }

  
    public void generateInvoice(String customer, double amount) {
        double total = amount + calculateHandlingFee(amount);
        System.out.println("--- STANDARD INVOICE ---");
        System.out.println("Customer: " + customer);
        System.out.println("Base Amount: $" + amount);
        System.out.println("Total (including internal fees): $" + total);
    }

    public void showInternalFees(double amount) {
        System.out.println("Internal System Log: Handling Fee is $" + calculateHandlingFee(amount));
    }
}

class RetailInvoice extends InvoiceProcessor {
    
    @Override
    public void generateInvoice(String customer, double amount) {
        double discount = amount * 0.15; // 15% Retail Discount
        double finalAmount = amount - discount;
        
        System.out.println("--- RETAIL INVOICE (Discounted) ---");
        System.out.println("Customer: " + customer);
        System.out.println("Original Price: $" + amount);
        System.out.println("Retail Discount (15%): -$" + discount);
        System.out.println("Final Retail Price: $" + finalAmount);
        
    }
}

public class BillingSystem {
    public static void main(String[] args) {
        // 1. Standard behavior using Parent reference and Parent object
        InvoiceProcessor standardProc = new InvoiceProcessor();
        standardProc.generateInvoice("Corporate Alpha", 1000.0);
        
        System.out.println();

        InvoiceProcessor retailProc = new RetailInvoice();
        
        retailProc.generateInvoice("Jane Doe", 1000.0);

        System.out.println();
        retailProc.showInternalFees(1000.0);
    }
}