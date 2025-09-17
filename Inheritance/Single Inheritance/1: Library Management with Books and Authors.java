// Superclass: Book
class Book {
    String title;
    int publicationYear;

    // Constructor
    Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    void displayInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }
}

// Subclass: Author
class Author extends Book {
    String name;
    String bio;

    // Constructor calls superclass constructor (Book)
    Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    // Overriding displayInfo() to include author details
    @Override
    void displayInfo() {
        super.displayInfo();  // Call Book’s method
        System.out.println("Author Name: " + name);
        System.out.println("Author Bio: " + bio);
    }
}

// Main Class
public class LibraryManagement {
    public static void main(String[] args) {
        Author authorBook = new Author("Java Programming", 2021, "James Gosling", "Father of Java Programming Language");
        authorBook.displayInfo();
    }
}

