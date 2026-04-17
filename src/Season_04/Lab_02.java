package Season_04;

class Book {
    String title;
    String author;
    String ISBN;
    int yearPublished;
    int copiesAvailable;

    // Constructor 1: Only title and author
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.ISBN = "Unknown"; // Default values for the rest
        this.yearPublished = 0;
        this.copiesAvailable = 0;
    }

    // Constructor 2: Title, author, and ISBN
    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.yearPublished = 0;
        this.copiesAvailable = 0;
    }

    // Constructor 3: All attributes
    public Book(String title, String author, String ISBN, int yearPublished, int copiesAvailable) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.yearPublished = yearPublished;
        this.copiesAvailable = copiesAvailable;
    }

    // Method to display book info
    public void displayBookInfo() {
        System.out.println("Title: " + title + " | Author: " + author + " | ISBN: " + ISBN +
                " | Year: " + yearPublished + " | Copies: " + copiesAvailable);
    }

    // Method to update copies
    public void updateCopies(int newCopies) {
        this.copiesAvailable = newCopies;
        System.out.println("Copies updated to: " + this.copiesAvailable);
    }
}

public class Lab_02  {
    public static void main(String[] args) {
        // Creating books using different constructors
        Book book1 = new Book("Java Basics", "John Doe");
        Book book2 = new Book("Advanced Java", "Jane Smith", "123-456-789");
        Book book3 = new Book("OOP with Java", "Alan Turing", "987-654-321", 2023, 10);

        book1.displayBookInfo();
        book2.displayBookInfo();
        book3.displayBookInfo();

        book3.updateCopies(15);
    }
}
