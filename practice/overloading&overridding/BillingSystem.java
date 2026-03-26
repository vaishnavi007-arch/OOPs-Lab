// Superclass: General Invoice Logic
class InvoiceProcessor {

    // 1. Public method for generating an invoice (to be overridden)
    public void generateInvoice(double amount) {
        double finalAmount = amount + calculateTax(amount);
        System.out.println("--- General Invoice ---");
        System.out.println("Base Amount: $" + amount);
        System.out.println("Total with Tax: $" + finalAmount);
    }

    // 2. Private method: Sensitive internal calculation
    // This CANNOT be seen or overridden by RetailInvoice
    private double calculateTax(double amount) {
        return amount * 0.05; // Standard 5% tax
    }

    // 3. Public method to prove the private method still works internally
    public void runInternalCheck(double amount) {
        System.out.println("Internal System Tax Check: $" + calculateTax(amount));
    }
}

// Subclass: Retail-specific Logic
class RetailInvoice extends InvoiceProcessor {

    // 4. Overriding the behavior to add a discount
    @Override
    public void generateInvoice(double amount) {
        double discount = amount * 0.10; // 10% Retail Discount
        double discountedAmount = amount - discount;
        System.out.println("--- Retail Invoice ---");
        System.out.println("Original: $" + amount);
        System.out.println("Retail Discount (10%): -$" + discount);
        System.out.println("Final Retail Price: $" + discountedAmount);
    }

    // 5. This is NOT an override. It's a new method because 
    // the parent's calculateTax is private/invisible.
    public void calculateTax() {
        System.out.println("Retail Tax: Custom logic applied.");
    }
}

public class BillingSystem {
    public static void main(String[] args) {
        // A. Standard Superclass Reference
        InvoiceProcessor general = new InvoiceProcessor();
        
        // B. Runtime Polymorphism: Parent reference -> Child object
        // This is the "Enterprise" way of handling different invoice types
        InvoiceProcessor retail = new RetailInvoice();

        System.out.println("EXECUTION 1: General Reference");
        general.generateInvoice(100.0);

        System.out.println("\nEXECUTION 2: Polymorphic Reference");
        // Even though 'retail' is an InvoiceProcessor type, 
        // it executes the RetailInvoice version of the method.
        retail.generateInvoice(100.0);

        System.out.println("\nEXECUTION 3: Private Method Integrity");
        // The subclass can't change the parent's private tax logic
        retail.runInternalCheck(100.0);
    }
}