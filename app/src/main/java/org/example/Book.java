package org.example;
public class Book {

    // This is your working class.
    private String title;
    private String author;
    private int yearPublished;

    // Constructor
    public Book(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    // Getter methods
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    // Method to display book details
    public void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Year Published: " + yearPublished);
    }
    
}
