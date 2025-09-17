
class Item {
    private String id;
    private String itemName;
    private double price;

    Item(String i, String n, double p) {
        id = i;
        itemName = n;
        price = p;
    }

    double totalValue(int qty) {
        return qty * price;
    }

    void info(int qty) {
        System.out.println(id + " - " + itemName + " | " + qty + " pcs | Total: " + totalValue(qty));
    }

    public static void main(String[] args) {
        Item pen = new Item("P09", "Gel Pen", 15);
        Item book = new Item("B12", "Register", 80);

        pen.info(20);
        book.info(3);
    }
}
