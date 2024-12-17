package org.example;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    // Constructor
    public Library() {
        books = new ArrayList<>();
    }

    // Method to add a book
    public void addBook(Book book) {
        books.add(book);
    }

    // Method to display all books in the library
    public void displayBooks() {
        for (Book book : books) {
            book.display();
        }
    }

    // Method to find a book by title
    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null; // If no book found
    }
    
}
