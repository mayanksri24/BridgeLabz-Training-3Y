

class Book {
    private String name;
    private String author;
    private double price;

    Book(String n, String a, double p) {
        name = n;
        author = a;
        price = p;
    }

    void show() {
        System.out.println(name + " by " + author + " costs " + price);
    }

    public static void main(String[] args) {
        Book b1 = new Book("Wings of Fire", "A.P.J. Abdul Kalam", 350);
        Book b2 = new Book("Rich Dad Poor Dad", "Robert Kiyosaki", 599);
        b1.show();
        b2.show();
    }
}
