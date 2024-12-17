/*
 * This should be your main class where all your objects will be created
 */
package org.example;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
         // Create a library
         Library library = new Library();

         // Add books to the library
         library.addBook(new Book("1984", "George Orwell", 1949));
         library.addBook(new Book("To Kill a Mockingbird", "Harper Lee", 1960));
         library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925));
 
         // Display all books in the library
         System.out.println("Books in the library:");
         library.displayBooks();
 
         // Create a patron
         Patron patron = new Patron("Alice");
 
         // Patron borrows a book
         System.out.println("\nPatron borrowing books:");
         patron.borrowBook(library, "1984"); // Book is available
         patron.borrowBook(library, "The Catcher in the Rye"); // Book is not available
    }
}
