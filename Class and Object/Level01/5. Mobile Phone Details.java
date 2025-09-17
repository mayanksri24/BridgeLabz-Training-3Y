
class Mobile {
    private String brand;
    private String model;
    private double price;

    Mobile(String b, String m, double p) {
        brand = b;
        model = m;
        price = p;
    }

    void details() {
        System.out.println(brand + " " + model + " : Rs." + price);
    }

    public static void main(String[] args) {
        Mobile m1 = new Mobile("OnePlus", "11R", 39999);
        Mobile m2 = new Mobile("Google", "Pixel 8", 72999);

        m1.details();
        m2.details();
    }
}
