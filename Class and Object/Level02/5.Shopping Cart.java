

class Cart {
    String item;
    int qty;
    double rate;

    Cart(String i, double r, int q) {
        item = i;
        rate = r;
        qty = q;
    }

    void addItem(int q) {
        qty += q;
        System.out.println(q + " " + item + " added.");
    }

    void removeItem(int q) {
        if (q <= qty) {
            qty -= q;
            System.out.println(q + " " + item + " removed.");
        } else {
            System.out.println("Not enough items to remove.");
        }
    }

    double total() {
        return qty * rate;
    }

    void info() {
        System.out.println(item + " | Price: " + rate + " | Qty: " + qty + " | Total: " + total());
    }

    public static void main(String[] args) {
        Cart c = new Cart("Laptop", 60000, 1);
        c.info();
        c.addItem(2);
        c.removeItem(1);
        c.info();
    }
}
