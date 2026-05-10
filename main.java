class Book {
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true; 
    }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Success: You borrowed " + title);
        } else {
            System.out.println("Failed: " + title + " is currently unavailable.");
        }
    }

    public String getDetails() {
        return title + " by " + author + " [Available: " + isAvailable + "]";
    }
}

class DigitalBook extends Book {
    private double fileSize;

    public DigitalBook(String title, String author, double fileSize) {
        super(title, author); 
        this.fileSize = fileSize;
    }
}

public class LibraryOOP {
    public static void main(String[] args) {
        Book b1 = new Book("Java Basics", "John Smith");
        DigitalBook d1 = new DigitalBook("Clean Code", "Robert Martin", 1.5);

        System.out.println("--- OOP Library ---");
        System.out.println(b1.getDetails());
        
        b1.borrowBook(); 
        b1.borrowBook();
    }
}.



/// PROCEDURAL METHOD NOW


import java.util.Scanner;
public class LibraryProcedural {
    public static void main(String[] args) {

        String[] titles = {"Java Basics", "Clean Code"};
        String[] authors = {"John Smith", "Robert Martin"};
        boolean[] isAvailable = {true, true};

        System.out.println("--- Procedural Library ---");
        borrowBook(0, titles, isAvailable);
        borrowBook(0, titles, isAvailable); 
    }

    public static void borrowBook(int index, String[] titles, boolean[] available) {
        if (available[index]) {
            available[index] = false;
            System.out.println("You borrowed: " + titles[index]);
        } else {
            System.out.println("Error: " + titles[index] + " is already out.");
        }
    }
}

