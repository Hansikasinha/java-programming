class Book {
    // Instance variables
    private String title;
    private String author;
    private double price;

    // Default constructor
    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    // Constructor: title + author
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.price = 0.0;    // default price
    }

    // Constructor: all fields
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to print book details
    public void printDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: ₹" + price);
        System.out.println("------------------------");
    }
}

public class Main {
    public static void main(String[] args) {

        // Using default constructor
        Book b1 = new Book();
        b1.printDetails();

        // Using constructor with title and author
        Book b2 = new Book("The Alchemist", "Paulo Coelho");
        b2.printDetails();

        // Using constructor with all fields
        Book b3 = new Book("Atomic Habits", "James Clear", 450.0);
        b3.printDetails();
    }
}
