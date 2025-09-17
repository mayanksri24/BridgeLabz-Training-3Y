public class Product {
    private static double discount = 0.0;

    private final String id;
    private String name;
    private double price;
    private int qty;

    public Product(String id, String name, double price, int qty) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    public static void setDiscount(double d) {
        if (d >= 0 && d <= 100) discount = d;
        else System.out.println("Invalid discount percentage. Please enter 0–100.");
    }

    public double discountedPrice() {
        return price - (price * discount / 100);
    }

    public void showDetails() {
        System.out.println("Product ID: " + id);
        System.out.println("Product Name: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Quantity: " + qty);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Price after Discount: $" + discountedPrice());
    }

    public static void main(String[] args) {
        Product.setDiscount(10.0);

        Product p1 = new Product("P001", "Laptop", 1200.00, 5);
        Product p2 = new Product("P002", "Smartphone", 800.00, 10);

        p1.showDetails();
        System.out.println();
        p2.showDetails();
    }
}
