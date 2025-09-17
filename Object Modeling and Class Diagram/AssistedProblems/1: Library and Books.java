import java.util.*;

class Book {
    private String title;
    private String author;
    private String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public void display() {
        System.out.println(title + " (" + isbn + ") by " + author);
    }
}

class Library {
    private String libraryName;
    private List<Book> collection = new ArrayList<>();

    public Library(String libraryName) {
        this.libraryName = libraryName;
    }

    public void addBook(Book book) {
        collection.add(book);
    }

    public void showBooks() {
        System.out.println("Library: " + libraryName);
        if (collection.isEmpty()) {
            System.out.println("No books available.");
        } else {
            for (Book b : collection) {
                b.display();
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Book b1 = new Book("Clean Code", "Robert C. Martin", "ISBN001");
        Book b2 = new Book("The Guide", "R.K. Narayan", "ISBN002");
        Book b3 = new Book("Sapiens", "Yuval Noah Harari", "ISBN003");

        Library lib1 = new Library("City Library");
        Library lib2 = new Library("College Library");

        lib1.addBook(b1);
        lib1.addBook(b2);

        lib2.addBook(b2);
        lib2.addBook(b3);

        lib1.showBooks();
        lib2.showBooks();
    }
}

