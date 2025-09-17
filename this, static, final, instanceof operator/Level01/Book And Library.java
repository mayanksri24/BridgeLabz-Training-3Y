class Book {
    private static String libraryName;
    private final String isbn;
    private String title;
    private String author;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public static void setLibraryName(String name) {
        libraryName = name;
    }

    public static void showLibrary() {
        System.out.println("Library Name: " + libraryName);
    }

    public void showBook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
    }
}

public class Library {
    public static void main(String[] args) {
        Book.setLibraryName("Egmore Library");
        Book.showLibrary();

        Book b1 = new Book("Effective Java", "Joshua Bloch", "978-0134685991");
        b1.showBook();
    }
}
