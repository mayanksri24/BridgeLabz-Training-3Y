
package com.bridgelabz.oops.levelone;

public class BookInfo {
    String title;
    String writer;
    double cost;

    // constructor
    BookInfo(String t, String w, double c) {
        title = t;
        writer = w;
        cost = c;
    }

    void printBook() {
        System.out.println("Book Title : " + title);
        System.out.println("Author     : " + writer);
        System.out.println("Price      : " + cost);
        System.out.println("-------------------");
    }

    public static void main(String[] args) {
        BookInfo b1 = new BookInfo("Harry Potter", "J.K. Rowling", 799);
        BookInfo b2 = new BookInfo("The Alchemist", "Paulo Coelho", 499);

        b1.printBook();
        b2.printBook();
    }
}
