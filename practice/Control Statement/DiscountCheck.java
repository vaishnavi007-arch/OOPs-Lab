public class DiscountCheck {
    public static void main(String[] args) {
        int age = 20;
        boolean isStudent = true;

        if (isStudent || age >= 65) {
            System.out.println("Discount Applied!");
        } else {
            System.out.println("Full Price.");
        }
    }
}