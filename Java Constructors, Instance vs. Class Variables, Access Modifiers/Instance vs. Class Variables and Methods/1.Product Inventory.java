
public class Product {
    String productName;
    double price;
    static int totalProducts = 0; // class variable

    // Constructor
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++; // count every new product
    }

    // Instance method
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName + ", Price: " + price);
    }

    // Class method
    public static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }

    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 55000);
        Product p2 = new Product("Phone", 25000);

        p1.displayProductDetails();
        p2.displayProductDetails();

        Product.displayTotalProducts();
    }
}
