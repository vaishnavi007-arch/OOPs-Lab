public class retail_shop {
    public static void main(String[] args) {
        int itema = 200, itemb = 75, itemc = 500;
        double price;
        price = ((itema * 2) + (itemb) + (itemc * 3));
        price = price - (0.1 * price); // Apply 10% discount
        price = price + (0.05 * price); // Add 5% tax
        System.out.println(price);
    }
}
