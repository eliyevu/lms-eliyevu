package org.example;

public class Book {

    //Attributes of book
    private String title;
    private String author;
    private String isbn;
    private int yearPublished;
    boolean isBookAvailable = true;//Set books to be available by default
    //Constructor to construct book object
    public Book(String title, String author, String isbn, int yearPublished) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.yearPublished = yearPublished;
    }
    //Getters and Setters
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public String getYearPublished() { return isbn; }
    public void setYearPublished(int yearPublished) { this.yearPublished = yearPublished; }
    //Check availability of book for borrowing
    public boolean isBookAvailable() {
        return isBookAvailable;
    }

    //Method to show if a book has been borrowed or not
    public void borrowBook() {
        if (isBookAvailable) {
            isBookAvailable = true;
            System.out.println("The book " + title + " has been borrowed.");
        }else{
            System.out.println("Sorry, " + title + " is not available");
        }
    }
    //Method to show if a book has been returned or not
    public void returnBook() {
        if (isBookAvailable) {
            isBookAvailable = true;
            System.out.println("The book " + title + " has been returned.");
        } else {
            System.out.println("The book " + title + " was not borrowed.");
        }
    }
    public void bookDetails(){
        System.out.println("Book Details");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year Published: " + yearPublished);
        System.out.println("ISBN: " + isbn);
        System.out.println("Available: " + (isBookAvailable? "Yes" : "No"));

    }


}
