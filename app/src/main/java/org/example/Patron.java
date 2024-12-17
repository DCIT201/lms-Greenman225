package org.example;

public class Patron {
    private String name;

    // Constructor
    public Patron(String name) {
        this.name = name;
    }

    // Method to borrow a book
    public void borrowBook(Library library, String bookTitle) {
        Book book = library.findBookByTitle(bookTitle);
        if (book != null) {
            System.out.println(name + " borrowed the book: " + book.getTitle());
        } else {
            System.out.println("Sorry, the book '" + bookTitle + "' is not available.");
        }
    }
    
}
