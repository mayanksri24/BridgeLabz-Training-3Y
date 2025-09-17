
class Book {
    public String ISBN;
    protected String title;
    private String author;

    // Constructor
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Getter and Setter for private author
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void displayBook() {
        System.out.println("ISBN: " + ISBN + ", Title: " + title + ", Author: " + author);
    }
}

class EBook extends Book {
    private double fileSize;

    public EBook(String ISBN, String title, String author, double fileSize) {
        super(ISBN, title, author);
        this.fileSize = fileSize;
    }

    public void displayEBook() {
        // Access public ISBN and protected title
        System.out.println("EBook - ISBN: " + ISBN + ", Title: " + title + ", File Size: " + fileSize + "MB");
    }

    public static void main(String[] args) {
        EBook ebook = new EBook("978-1234567890", "Java Basics", "John Doe", 2.5);
        ebook.displayBook();
        ebook.displayEBook();
        ebook.setAuthor("Jane Smith");
        System.out.println("Updated Author: " + ebook.getAuthor());
    }
}
